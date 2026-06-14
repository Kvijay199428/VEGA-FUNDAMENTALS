package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vega.fundamentals.dto.*;
import com.vega.fundamentals.model.FundamentalEndpoint;
import com.vega.fundamentals.util.SectionResponseFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Service
@Slf4j
public class FundamentalHistoryService {

    private static final java.util.Set<String> VOLATILE_FIELDS = java.util.Set.of(
            "fetchedTs", "generatedTs", "cacheHit", "ageMinutes",
            "requestDurationMs", "status", "message", "errorCode"
    );

    private final String historyPath;
    private final ObjectMapper objectMapper;
    private final ConcurrentHashMap<String, ReentrantLock> locks = new ConcurrentHashMap<>();

    public FundamentalHistoryService(@Value("${storage.history.fundamentals-path}") String historyPath, ObjectMapper objectMapper) {
        this.historyPath = historyPath;
        this.objectMapper = objectMapper.copy();
        this.objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    }

    /**
     * Archives all changed sections of a snapshot.
     */
    public void archiveSnapshot(FundamentalSnapshot snapshot) {
        if (snapshot == null || snapshot.getIsin() == null) return;

        String isin = snapshot.getIsin();
        ReentrantLock lock = locks.computeIfAbsent(isin, k -> new ReentrantLock());
        lock.lock();
        try {
            Path isinHistoryDir = Path.of(historyPath, isin);
            Files.createDirectories(isinHistoryDir);
            
            IsinMetadata metadata = loadOrRebuildMetadata(snapshot);

            for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
                SectionResponse<?> section = getSection(snapshot, endpoint);
                archiveIfChanged(isin, endpoint, section, metadata);
            }
            
            saveIsinMetadata(isin, metadata);

        } catch (Exception e) {
            log.error("Failed to archive snapshot for ISIN {}: {}", isin, e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    private SectionResponse<?> getSection(FundamentalSnapshot snapshot, FundamentalEndpoint endpoint) {
        return switch (endpoint) {
            case PROFILE -> snapshot.getProfile();
            case BALANCE_SHEET -> snapshot.getBalanceSheet();
            case CASH_FLOW -> snapshot.getCashFlow();
            case INCOME_STATEMENT -> snapshot.getIncomeStatement();
            case SHARE_HOLDINGS -> snapshot.getShareHoldings();
            case KEY_RATIOS -> snapshot.getKeyRatios();
            case CORPORATE_ACTIONS -> snapshot.getCorporateActions();
            case COMPETITORS -> snapshot.getCompetitors();
        };
    }

    private void archiveIfChanged(String isin, FundamentalEndpoint endpoint, SectionResponse<?> section, IsinMetadata metadata) {
        if (section == null || !"success".equals(section.getStatus()) || section.getData() == null) {
            return;
        }

        try {
            JsonNode dataNode = objectMapper.valueToTree(section.getData());
            JsonNode normalizedNode = normalize(dataNode);
            JsonNode canonicalNode = canonicalize(normalizedNode, endpoint);
            String currentHash = generateHash(canonicalNode);

            IsinMetadata.EndpointMetadata lastEntry = metadata.getEndpoints().get(endpoint.getKey());

            if (lastEntry != null && currentHash.equals(lastEntry.getHash())) {
                log.debug("No change detected for {} (ISIN: {}). Skipping archive.", endpoint.getKey(), isin);
                return;
            }

            // Data has changed, archive it
            long nextVersion = (lastEntry != null) ? lastEntry.getVersion() + 1 : 1;
            HistoryRecord record = HistoryRecord.builder()
                    .version(nextVersion)
                    .ts(Instant.now())
                    .hash(currentHash)
                    .data(dataNode)
                    .build();

            long offset = appendHistory(Path.of(historyPath, isin), endpoint, record);

            // Update metadata
            metadata.getEndpoints().put(endpoint.getKey(), IsinMetadata.EndpointMetadata.builder()
                    .hash(currentHash)
                    .version(nextVersion)
                    .lastUpdatedTs(record.getTs())
                    .offset(offset)
                    .build());
            
            metadata.setLastUpdatedTs(record.getTs());

            log.info("Archived v{} of {} for ISIN: {} (offset: {})", nextVersion, endpoint.getKey(), isin, offset);

        } catch (Exception e) {
            log.error("Failed to archive {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
        }
    }

    private IsinMetadata loadOrRebuildMetadata(FundamentalSnapshot snapshot) throws IOException {
        String isin = snapshot.getIsin();
        Path isinDir = Path.of(historyPath, isin);
        File metadataFile = isinDir.resolve("metadata.json").toFile();

        IsinMetadata metadata = null;
        if (metadataFile.exists()) {
            try {
                metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
                // Update with latest info from snapshot if provided
                metadata.setSymbol(snapshot.getSymbol());
                metadata.setCompanyName(snapshot.getCompanyName());
                metadata.setExchange(snapshot.getExchange());
            } catch (Exception e) {
                log.warn("metadata.json corrupted for ISIN: {}. Rebuilding...", isin);
            }
        }

        if (metadata == null) {
            log.info("metadata.json missing or corrupted for ISIN: {}. Rebuilding from history...", isin);
            metadata = rebuildMetadataFromHistory(isin);
            
            // Supplement with snapshot data if history was incomplete
            if (metadata.getSymbol() == null) metadata.setSymbol(snapshot.getSymbol());
            if (metadata.getCompanyName() == null) metadata.setCompanyName(snapshot.getCompanyName());
            if (metadata.getExchange() == null) metadata.setExchange(snapshot.getExchange());
        }
        return metadata;
    }

    public IsinMetadata rebuildMetadataFromHistory(String isin) {
        Instant now = Instant.now();
        IsinMetadata metadata = IsinMetadata.builder()
                .isin(isin)
                .createdTs(now) // Default to now, will be updated if history found
                .firstSeenTs(now)
                .lastUpdatedTs(now)
                .endpoints(new HashMap<>())
                .build();

        Instant absoluteFirstTs = null;
        Instant absoluteLastTs = null;

        for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
            LatestRecordInfo latestInfo = readLatestRecordDetailed(isin, endpoint);
            if (latestInfo != null) {
                HistoryRecord lastRecord = latestInfo.getRecord();
                metadata.getEndpoints().put(endpoint.getKey(), IsinMetadata.EndpointMetadata.builder()
                        .hash(lastRecord.getHash())
                        .version(lastRecord.getVersion())
                        .lastUpdatedTs(lastRecord.getTs())
                        .offset(latestInfo.getOffset())
                        .build());

                if (absoluteLastTs == null || lastRecord.getTs().isAfter(absoluteLastTs)) {
                    absoluteLastTs = lastRecord.getTs();
                }

                // Recover metadata from PROFILE if possible
                if (endpoint == FundamentalEndpoint.PROFILE) {
                    try {
                        CompanyProfileDto profile = objectMapper.convertValue(lastRecord.getData(), CompanyProfileDto.class);
                        // Some profile info might be null if not enriched, but Aggregator usually enriches.
                        // However, history stores raw or enriched data depending on when it was archived.
                    } catch (Exception e) {
                        log.warn("Failed to extract profile info during metadata rebuild for ISIN: {}", isin);
                    }
                }

                // Find the first record for this endpoint to get firstSeenTs
                HistoryRecord firstRecord = readFirstRecord(isin, endpoint);
                if (firstRecord != null) {
                    if (absoluteFirstTs == null || firstRecord.getTs().isBefore(absoluteFirstTs)) {
                        absoluteFirstTs = firstRecord.getTs();
                    }
                }
            }
        }

        if (absoluteFirstTs != null) {
            metadata.setFirstSeenTs(absoluteFirstTs);
            metadata.setCreatedTs(absoluteFirstTs); // createdTs usually aligns with first seen
        }
        if (absoluteLastTs != null) {
            metadata.setLastUpdatedTs(absoluteLastTs);
        }

        // Try to recover Symbol/Name from reconstruction if possible (PROFILE section)
        reconstructSnapshot(isin).ifPresent(snapshot -> {
            metadata.setSymbol(snapshot.getSymbol());
            metadata.setCompanyName(snapshot.getCompanyName());
            metadata.setExchange(snapshot.getExchange());
        });

        if (!metadata.getEndpoints().isEmpty()) {
            log.info("Successfully rebuilt metadata from history for ISIN: {} with {} endpoints.", isin, metadata.getEndpoints().size());
        }
        return metadata;
    }

    private void rebuildEndpointMetadata(String isin, IsinMetadata metadata) {
        // Legacy method now delegates to the more comprehensive rebuild
        IsinMetadata rebuilt = rebuildMetadataFromHistory(isin);
        metadata.setEndpoints(rebuilt.getEndpoints());
        metadata.setFirstSeenTs(rebuilt.getFirstSeenTs());
        metadata.setCreatedTs(rebuilt.getCreatedTs());
        metadata.setLastUpdatedTs(rebuilt.getLastUpdatedTs());
        if (metadata.getSymbol() == null) metadata.setSymbol(rebuilt.getSymbol());
        if (metadata.getCompanyName() == null) metadata.setCompanyName(rebuilt.getCompanyName());
        if (metadata.getExchange() == null) metadata.setExchange(rebuilt.getExchange());
    }

    private HistoryRecord readFirstRecord(String isin, FundamentalEndpoint endpoint) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            String line = raf.readLine();
            if (line != null && !line.trim().isEmpty()) {
                return objectMapper.readValue(line, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read first record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private void saveIsinMetadata(String isin, IsinMetadata metadata) throws IOException {
        File metadataFile = Path.of(historyPath, isin, "metadata.json").toFile();
        objectMapper.writeValue(metadataFile, metadata);
        // Clean up legacy index if it exists
        Files.deleteIfExists(Path.of(historyPath, isin, "latest-index.json"));
    }

    private JsonNode normalize(JsonNode node) {
        if (node == null) return null;
        if (node.isArray()) {
            com.fasterxml.jackson.databind.node.ArrayNode normalizedArray = objectMapper.createArrayNode();
            for (JsonNode item : node) {
                normalizedArray.add(normalize(item));
            }
            return normalizedArray;
        }
        if (!node.isObject()) return node;
        
        ObjectNode normalized = node.deepCopy();
        VOLATILE_FIELDS.forEach(normalized::remove);
        
        java.util.Iterator<Map.Entry<String, JsonNode>> fields = normalized.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            normalized.set(field.getKey(), normalize(field.getValue()));
        }
        
        return normalized;
    }

    private JsonNode canonicalize(JsonNode node, FundamentalEndpoint endpoint) {
        if (node == null || !node.isArray()) return node;

        com.fasterxml.jackson.databind.node.ArrayNode array = (com.fasterxml.jackson.databind.node.ArrayNode) node;
        java.util.List<JsonNode> elements = new java.util.ArrayList<>();
        array.forEach(elements::add);

        switch (endpoint) {
            case COMPETITORS -> elements.sort(java.util.Comparator.comparing(n -> n.path("instrument_key").asText("")));
            case SHARE_HOLDINGS -> elements.sort(java.util.Comparator.comparing(n -> n.path("category").asText("")));
            case KEY_RATIOS -> elements.sort(java.util.Comparator.comparing(n -> n.path("name").asText("")));
            case CORPORATE_ACTIONS -> elements.sort(java.util.Comparator.comparing((JsonNode n) -> n.path("name").asText(""))
                    .thenComparing(n -> n.path("expiry_date").asText("")));
        }

        com.fasterxml.jackson.databind.node.ArrayNode sortedArray = objectMapper.createArrayNode();
        elements.forEach(sortedArray::add);
        return sortedArray;
    }

    private String generateHash(JsonNode node) throws NoSuchAlgorithmException, JsonProcessingException {
        String canonicalJson = objectMapper.writeValueAsString(node);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(canonicalJson.getBytes(StandardCharsets.UTF_8));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

    private long appendHistory(Path dir, FundamentalEndpoint endpoint, HistoryRecord record) throws IOException {
        File historyFile = dir.resolve(endpoint.getFilename()).toFile();
        long offset = historyFile.exists() ? historyFile.length() : 0;
        
        String line = objectMapper.writeValueAsString(record);
        try (FileWriter fw = new FileWriter(historyFile, true)) {
            fw.write(line + "\n");
        }
        return offset;
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin) {
        return reconstructSnapshot(isin, null);
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin, Instant asOf) {
        Path isinDir = Path.of(historyPath, isin);
        if (!Files.exists(isinDir)) return Optional.empty();

        File metadataFile = isinDir.resolve("metadata.json").toFile();
        if (!metadataFile.exists() && asOf == null) return Optional.empty();

        try {
            IsinMetadata metadata = metadataFile.exists() ? objectMapper.readValue(metadataFile, IsinMetadata.class) : null;

            FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                    .schemaVersion("2.0")
                    .status("success")
                    .source("HISTORY")
                    .isin(isin)
                    .cacheHit(true);

            if (metadata != null) {
                builder.symbol(metadata.getSymbol())
                        .companyName(metadata.getCompanyName())
                        .exchange(metadata.getExchange())
                        .generatedTs(metadata.getLastUpdatedTs());
            }

            for (FundamentalEndpoint endpoint : FundamentalEndpoint.values()) {
                setReconstructedSection(builder, isin, endpoint, metadata, asOf);
            }

            FundamentalSnapshot snapshot = builder.build();
            return Optional.of(snapshot);

        } catch (IOException e) {
            log.error("Failed to reconstruct snapshot for ISIN {}: {}", isin, e.getMessage());
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    private void setReconstructedSection(FundamentalSnapshot.FundamentalSnapshotBuilder builder, String isin, FundamentalEndpoint endpoint, IsinMetadata metadata, Instant asOf) {
        SectionResponse<?> section = reconstructSection(isin, endpoint, metadata, asOf);
        switch (endpoint) {
            case PROFILE -> builder.profile((SectionResponse<CompanyProfileDto>) section);
            case BALANCE_SHEET -> builder.balanceSheet((SectionResponse<BalanceSheetContainer>) section);
            case CASH_FLOW -> builder.cashFlow((SectionResponse<CashFlowContainer>) section);
            case INCOME_STATEMENT -> builder.incomeStatement((SectionResponse<IncomeStatementContainer>) section);
            case SHARE_HOLDINGS -> builder.shareHoldings((SectionResponse<List<ShareHoldingDto>>) section);
            case KEY_RATIOS -> builder.keyRatios((SectionResponse<List<KeyRatioDto>>) section);
            case CORPORATE_ACTIONS -> builder.corporateActions((SectionResponse<List<CorporateActionDto>>) section);
            case COMPETITORS -> builder.competitors((SectionResponse<List<CompetitorDto>>) section);
        }
    }

    @SuppressWarnings("unchecked")
    private <T> SectionResponse<T> reconstructSection(String isin, FundamentalEndpoint endpoint, IsinMetadata metadata, Instant asOf) {
        HistoryRecord record = null;

        if (asOf == null && metadata != null) {
            IsinMetadata.EndpointMetadata endpointMeta = metadata.getEndpoints().get(endpoint.getKey());
            if (endpointMeta != null && endpointMeta.getOffset() >= 0) {
                record = readRecordAtOffset(isin, endpoint, endpointMeta.getOffset());
                // Integrity check: verify hash matches metadata
                if (record != null && !record.getHash().equals(endpointMeta.getHash())) {
                    log.warn("Hash mismatch for {} (ISIN: {}) at offset {}. Expected: {}, Actual: {}. Falling back to latest scan.",
                            endpoint.getKey(), isin, endpointMeta.getOffset(), endpointMeta.getHash(), record.getHash());
                    record = null;
                }
            }
        }

        if (record == null) {
            record = (asOf == null) ? readLatestRecord(isin, endpoint) : readRecordAtTimestamp(isin, endpoint, asOf);
        }

        if (record == null) {
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("HISTORY_MISSING")
                    .message("No historical data found for " + endpoint.getKey())
                    .build();
        }

        try {
            T data = (T) objectMapper.convertValue(record.getData(), endpoint.getTypeReference());
            return SectionResponseFactory.cached(data, record.getTs());
        } catch (Exception e) {
            log.error("Failed to deserialize {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("DESERIALIZATION_ERROR")
                    .message("Failed to deserialize " + endpoint.getKey())
                    .build();
        }
    }

    public HistoryRecord readLatestRecord(String isin, FundamentalEndpoint endpoint) {
        LatestRecordInfo info = readLatestRecordDetailed(isin, endpoint);
        return info != null ? info.getRecord() : null;
    }

    private HistoryRecord readRecordAtOffset(String isin, FundamentalEndpoint endpoint, long offset) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            if (offset >= raf.length()) return null;
            raf.seek(offset);
            String line = raf.readLine();
            if (line != null) {
                return objectMapper.readValue(line, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read record at offset {} for {} (ISIN: {}): {}", offset, endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private HistoryRecord readRecordAtTimestamp(String isin, FundamentalEndpoint endpoint, Instant timestamp) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try (RandomAccessFile raf = new RandomAccessFile(historyFile.toFile(), "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            // Simple reverse scan for small files. For large files, we'd want an index.
            long pos = length - 1;
            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    long offset = (pos == 0) ? 0 : pos + 1;
                    raf.seek(offset);
                    String line = raf.readLine();
                    if (line != null && !line.trim().isEmpty()) {
                        HistoryRecord record = objectMapper.readValue(line, HistoryRecord.class);
                        if (!record.getTs().isAfter(timestamp)) {
                            return record;
                        }
                    }
                    if (pos == 0) break;
                    pos = offset - 2; // Move before the newline we just found
                } else {
                    pos--;
                }
            }
        } catch (IOException e) {
            log.error("Failed to read record at timestamp for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private LatestRecordInfo readLatestRecordDetailed(String isin, FundamentalEndpoint endpoint) {
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try {
            return readLastLineDetailed(historyFile.toFile());
        } catch (IOException e) {
            log.error("Failed to read latest record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private LatestRecordInfo readLastLineDetailed(File file) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            long pos = length - 1;
            raf.seek(pos);
            while (pos > 0 && raf.readByte() == '\n') {
                pos--;
                raf.seek(pos);
            }

            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    long offset = (pos == 0) ? 0 : pos + 1;
                    raf.seek(offset);

                    byte[] bytes = new byte[(int) (length - offset)];
                    raf.readFully(bytes);
                    String line = new String(bytes, StandardCharsets.UTF_8).trim();
                    if (line.isEmpty()) return null;

                    HistoryRecord record = objectMapper.readValue(line, HistoryRecord.class);
                    return new LatestRecordInfo(record, offset);
                }
                pos--;
            }
        }
        return null;
    }

    @lombok.Data
    @lombok.AllArgsConstructor
    private static class LatestRecordInfo {
        private HistoryRecord record;
        private long offset;
    }
}
