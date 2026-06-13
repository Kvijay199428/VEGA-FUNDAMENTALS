package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
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
        // Ensure canonical JSON output for hashing
        this.objectMapper.configure(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS, true);
    }

    /**
     * Entry point for the Toll Gate. 
     * Compares incoming data with the latest stored hash and appends if different.
     */
    public void archiveIfChanged(String isin, String endpoint, Object data) {
        if (data == null) return;

        ReentrantLock lock = locks.computeIfAbsent(isin, k -> new ReentrantLock());
        lock.lock();
        try {
            JsonNode dataNode = objectMapper.valueToTree(data);
            String currentHash = generateHash(dataNode);
            
            Path isinHistoryDir = Path.of(historyPath, isin);
            Files.createDirectories(isinHistoryDir);
            
            File indexFile = isinHistoryDir.resolve("latest-index.json").toFile();
            Map<String, String> index = loadIndex(indexFile);
            
            String lastHash = index.get(endpoint);
            
            if (currentHash.equals(lastHash)) {
                log.debug("No change detected for {} (ISIN: {}). Skipping archive.", endpoint, isin);
                return;
            }

            // Data has changed, archive it
            appendHistory(isinHistoryDir, endpoint, currentHash, dataNode);
            
            // Update index
            index.put(endpoint, currentHash);
            saveIndex(indexFile, index);
            
            log.info("Archived new version of {} for ISIN: {}", endpoint, isin);
            
        } catch (Exception e) {
            log.error("Failed to archive history for {} (ISIN: {}): {}", endpoint, isin, e.getMessage());
        } finally {
            lock.unlock();
        }
    }

    private String generateHash(JsonNode node) throws NoSuchAlgorithmException, JsonProcessingException {
        // SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS ensures consistent hash
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

    private Map<String, String> loadIndex(File indexFile) {
        if (!indexFile.exists()) return new HashMap<>();
        try {
            return objectMapper.readValue(indexFile, new com.fasterxml.jackson.core.type.TypeReference<Map<String, String>>() {});
        } catch (IOException e) {
            log.warn("Failed to load history index: {}", e.getMessage());
            return new HashMap<>();
        }
    }

    private void saveIndex(File indexFile, Map<String, String> index) throws IOException {
        objectMapper.writeValue(indexFile, index);
    }

    private void appendHistory(Path dir, String endpoint, String hash, JsonNode data) throws IOException {
        File historyFile = dir.resolve(endpoint + ".jsonl").toFile();
        
        ObjectNode entry = objectMapper.createObjectNode();
        entry.put("ts", Instant.now().toString());
        entry.put("hash", hash);
        entry.set("data", data);
        
        String line = objectMapper.writeValueAsString(entry);
        
        try (FileWriter fw = new FileWriter(historyFile, true)) {
            fw.write(line + "\n");
        }
    }
}
