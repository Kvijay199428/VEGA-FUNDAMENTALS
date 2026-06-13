package com.vega.fundamentals.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class InstrumentService {

    private final String instrumentPath;
    private final ObjectMapper objectMapper;
    private final Map<String, InstrumentInfo> isinMap = new HashMap<>();

    public InstrumentService(@Value("${upstox.instrument-path}") String instrumentPath, ObjectMapper objectMapper) {
        this.instrumentPath = instrumentPath;
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void init() {
        log.info("Loading instruments from {}", instrumentPath);
        File file = new File(instrumentPath);
        if (!file.exists()) {
            log.warn("Instrument file not found at {}", instrumentPath);
            return;
        }

        try {
            JsonNode root = objectMapper.readTree(file);
            if (root.isArray()) {
                for (JsonNode node : root) {
                    String isin = node.path("isin").asText(null);
                    if (isin != null && !isin.isEmpty()) {
                        InstrumentInfo info = new InstrumentInfo();
                        info.setSymbol(node.path("trading_symbol").asText(node.path("asset_symbol").asText()));
                        info.setName(node.path("name").asText(null));
                        info.setExchange(node.path("exchange").asText());
                        isinMap.put(isin, info);
                    }
                }
            }
            log.info("Loaded {} instruments from {}", isinMap.size(), instrumentPath);
        } catch (IOException e) {
            log.error("Failed to load instruments: {}", e.getMessage());
        }
    }

    public InstrumentInfo getInstrument(String isin) {
        return isinMap.get(isin);
    }

    @Data
    public static class InstrumentInfo {
        private String symbol;
        private String name;
        private String exchange;
    }
}
