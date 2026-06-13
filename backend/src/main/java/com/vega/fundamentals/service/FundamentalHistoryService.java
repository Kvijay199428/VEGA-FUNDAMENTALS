package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.dto.HistoryRecord;
import com.vega.fundamentals.dto.IsinMetadata;
import com.vega.fundamentals.dto.SectionResponse;
import com.vega.fundamentals.model.FundamentalEndpoint;
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
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

@Service
@Slf4j
public class FundamentalHistoryService {

    private final String historyPath;
    private final ObjectMapper objectMapper;
    private final ConcurrentHashMap<String, ReentrantLock> locks = new ConcurrentHashMap<>();

    public FundamentalHistoryService(@Value("${storage.cache.fundamentals-path}") String cachePath, ObjectMapper objectMapper) {
        this.historyPath = cachePath + "/history";
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
            ensureIsinMetadata(snapshot);

            archiveIfChanged(isin, FundamentalEndpoint.PROFILE, snapshot.getProfile());
            archiveIfChanged(isin, FundamentalEndpoint.BALANCE_SHEET, snapshot.getBalanceSheet());
            archiveIfChanged(isin, FundamentalEndpoint.CASH_FLOW, snapshot.getCashFlow());
            archiveIfChanged(isin, FundamentalEndpoint.INCOME_STATEMENT, snapshot.getIncomeStatement());
            archiveIfChanged(isin, FundamentalEndpoint.SHARE_HOLDINGS, snapshot.getShareHoldings());
            archiveIfChanged(isin, FundamentalEndpoint.KEY_RATIOS, snapshot.getKeyRatios());
            archiveIfChanged(isin, FundamentalEndpoint.CORPORATE_ACTIONS, snapshot.getCorporateActions());
            archiveIfChanged(isin, FundamentalEndpoint.COMPETITORS, snapshot.getCompetitors());

        } catch (Exception e) {
            log.error("Failed to archive snapshot for ISIN {}: {}", isin, e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    private void archiveIfChanged(String isin, FundamentalEndpoint endpoint, SectionResponse<?> section) {
        if (section == null || !"success".equals(section.getStatus()) || section.getData() == null) {
            return;
        }

        try {
            JsonNode dataNode = objectMapper.valueToTree(section.getData());
            JsonNode normalizedNode = normalize(dataNode);
            String currentHash = generateHash(normalizedNode);

            Path isinHistoryDir = Path.of(historyPath, isin);
            Files.createDirectories(isinHistoryDir);

            File indexFile = isinHistoryDir.resolve("latest-index.json").toFile();
            Map<String, HistoryIndexEntry> index = loadIndex(indexFile);

            HistoryIndexEntry lastEntry = index.get(endpoint.getKey());

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

            appendHistory(isinHistoryDir, endpoint, record);

            // Update index
            index.put(endpoint.getKey(), new HistoryIndexEntry(currentHash, nextVersion, record.getTs()));
            saveIndex(indexFile, index);

            log.info("Archived v{} of {} for ISIN: {}", nextVersion, endpoint.getKey(), isin);

        } catch (Exception e) {
            log.error("Failed to archive {} for ISIN {}: {}", endpoint.getKey(), isin, e.getMessage());
        }
    }

    private void ensureIsinMetadata(FundamentalSnapshot snapshot) throws IOException {
        Path isinDir = Path.of(historyPath, snapshot.getIsin());
        Files.createDirectories(isinDir);
        File metadataFile = isinDir.resolve("metadata.json").toFile();

        IsinMetadata metadata;
        if (metadataFile.exists()) {
            metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
            metadata.setLastUpdatedTs(Instant.now());
            // Update other fields if they changed
            metadata.setSymbol(snapshot.getSymbol());
            metadata.setCompanyName(snapshot.getCompanyName());
            metadata.setExchange(snapshot.getExchange());
        } else {
            metadata = IsinMetadata.builder()
                    .isin(snapshot.getIsin())
                    .symbol(snapshot.getSymbol())
                    .companyName(snapshot.getCompanyName())
                    .exchange(snapshot.getExchange())
                    .createdTs(Instant.now())
                    .lastUpdatedTs(Instant.now())
                    .build();
        }
        objectMapper.writeValue(metadataFile, metadata);
    }

    private JsonNode normalize(JsonNode node) {
        if (node == null || !node.isObject()) return node;
        ObjectNode normalized = node.deepCopy();
        // Remove common volatile fields if they leaked into business data
        normalized.remove("fetchedTs");
        normalized.remove("generatedTs");
        normalized.remove("cacheHit");
        normalized.remove("ageMinutes");
        normalized.remove("requestDurationMs");
        normalized.remove("status");
        return normalized;
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

    private Map<String, HistoryIndexEntry> loadIndex(File indexFile) {
        if (!indexFile.exists()) return new HashMap<>();
        try {
            return objectMapper.readValue(indexFile, new TypeReference<Map<String, HistoryIndexEntry>>() {});
        } catch (IOException e) {
            log.warn("Failed to load history index: {}", e.getMessage());
            return new HashMap<>();
        }
    }

    private void saveIndex(File indexFile, Map<String, HistoryIndexEntry> index) throws IOException {
        objectMapper.writeValue(indexFile, index);
    }

    private void appendHistory(Path dir, FundamentalEndpoint endpoint, HistoryRecord record) throws IOException {
        File historyFile = dir.resolve(endpoint.getFilename()).toFile();
        String line = objectMapper.writeValueAsString(record);
        try (FileWriter fw = new FileWriter(historyFile, true)) {
            fw.write(line + "\n");
        }
    }

    public Optional<FundamentalSnapshot> reconstructSnapshot(String isin) {
        Path isinDir = Path.of(historyPath, isin);
        if (!Files.exists(isinDir)) return Optional.empty();

        File metadataFile = isinDir.resolve("metadata.json").toFile();
        if (!metadataFile.exists()) return Optional.empty();

        try {
            IsinMetadata metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);

            FundamentalSnapshot.FundamentalSnapshotBuilder builder = FundamentalSnapshot.builder()
                    .schemaVersion("2.0")
                    .status("success")
                    .source("HISTORY")
                    .isin(isin)
                    .symbol(metadata.getSymbol())
                    .companyName(metadata.getCompanyName())
                    .exchange(metadata.getExchange())
                    .generatedTs(metadata.getLastUpdatedTs())
                    .cacheHit(true);

            builder.profile(reconstructSection(isin, FundamentalEndpoint.PROFILE));
            builder.balanceSheet(reconstructSection(isin, FundamentalEndpoint.BALANCE_SHEET));
            builder.cashFlow(reconstructSection(isin, FundamentalEndpoint.CASH_FLOW));
            builder.incomeStatement(reconstructSection(isin, FundamentalEndpoint.INCOME_STATEMENT));
            builder.shareHoldings(reconstructSection(isin, FundamentalEndpoint.SHARE_HOLDINGS));
            builder.keyRatios(reconstructSection(isin, FundamentalEndpoint.KEY_RATIOS));
            builder.corporateActions(reconstructSection(isin, FundamentalEndpoint.CORPORATE_ACTIONS));
            builder.competitors(reconstructSection(isin, FundamentalEndpoint.COMPETITORS));

            FundamentalSnapshot snapshot = builder.build();
            return Optional.of(snapshot);

        } catch (IOException e) {
            log.error("Failed to reconstruct snapshot for ISIN {}: {}", isin, e.getMessage());
            return Optional.empty();
        }
    }

    @SuppressWarnings("unchecked")
    private <T> SectionResponse<T> reconstructSection(String isin, FundamentalEndpoint endpoint) {
        HistoryRecord record = readLatestRecord(isin, endpoint);
        if (record == null) {
            return (SectionResponse<T>) SectionResponse.builder()
                    .status("error")
                    .errorCode("HISTORY_MISSING")
                    .message("No historical data found for " + endpoint.getKey())
                    .build();
        }

        try {
            T data = (T) objectMapper.convertValue(record.getData(), endpoint.getDataType());
            return SectionResponse.cached(data, record.getTs());
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
        Path historyFile = Path.of(historyPath, isin, endpoint.getFilename());
        if (!Files.exists(historyFile)) return null;

        try {
            String lastLine = readLastLine(historyFile.toFile());
            if (lastLine != null) {
                return objectMapper.readValue(lastLine, HistoryRecord.class);
            }
        } catch (IOException e) {
            log.error("Failed to read latest record for {} (ISIN: {}): {}", endpoint.getKey(), isin, e.getMessage());
        }
        return null;
    }

    private String readLastLine(File file) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile(file, "r")) {
            long length = raf.length();
            if (length <= 0) return null;

            long pos = length - 1;
            // Skip trailing newlines
            raf.seek(pos);
            while (pos > 0 && raf.readByte() == '\n') {
                pos--;
                raf.seek(pos);
            }

            while (pos >= 0) {
                raf.seek(pos);
                if (pos == 0 || raf.readByte() == '\n') {
                    if (pos > 0) raf.seek(pos + 1);
                    else raf.seek(0);

                    byte[] bytes = new byte[(int) (length - (pos == 0 ? 0 : pos + 1))];
                    raf.readFully(bytes);
                    String line = new String(bytes, StandardCharsets.UTF_8).trim();
                    return line.isEmpty() ? null : line;
                }
                pos--;
            }
        }
        return null;
    }

    @lombok.Data
    @lombok.AllArgsConstructor
    @lombok.NoArgsConstructor
    public static class HistoryIndexEntry {
        private String hash;
        private long version;
        private Instant ts;
    }
}
