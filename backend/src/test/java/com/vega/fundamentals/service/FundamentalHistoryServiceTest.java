package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.dto.CompanyProfileDto;
import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.dto.SectionResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FundamentalHistoryServiceTest {

    private FundamentalHistoryService historyService;
    private ObjectMapper objectMapper;
    
    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        objectMapper = new ObjectMapper();
        objectMapper.findAndRegisterModules();
        historyService = new FundamentalHistoryService(tempDir.resolve("history").toString(), objectMapper);
    }

    @Test
    void testArchiveAndReconstructWithOffsets() throws IOException {
        String isin = "INE001A01011";
        CompanyProfileDto profile = new CompanyProfileDto();
        profile.setSector("Technology");
        profile.setFetchedTs(Instant.now());
        
        FundamentalSnapshot snapshot = FundamentalSnapshot.builder()
                .isin(isin)
                .symbol("RELIANCE")
                .companyName("Reliance Industries")
                .exchange("NSE")
                .profile(SectionResponse.success(profile))
                .build();
        
        // 1. Initial Archive
        historyService.archiveSnapshot(snapshot);
        
        // 2. Verify Offset in latest-index.json
        File indexFile = tempDir.resolve("history/INE001A01011/latest-index.json").toFile();
        assertTrue(indexFile.exists());
        
        Map<String, FundamentalHistoryService.HistoryIndexEntry> index = objectMapper.readValue(indexFile, 
                new TypeReference<Map<String, FundamentalHistoryService.HistoryIndexEntry>>() {});
        
        FundamentalHistoryService.HistoryIndexEntry profileEntry = index.get("profile");
        assertNotNull(profileEntry);
        assertEquals(0, profileEntry.getOffset()); // First record should be at offset 0
        
        // 3. Reconstruct (should use fast-path seek)
        Optional<FundamentalSnapshot> reconstructed = historyService.reconstructSnapshot(isin);
        assertTrue(reconstructed.isPresent());
        assertEquals("Technology", reconstructed.get().getProfile().getData().getSector());
        
        // 4. Archive Changed Data
        profile.setSector("Energy");
        snapshot.setProfile(SectionResponse.success(profile));
        historyService.archiveSnapshot(snapshot);
        
        // Verify new offset
        index = objectMapper.readValue(indexFile, new TypeReference<Map<String, FundamentalHistoryService.HistoryIndexEntry>>() {});
        profileEntry = index.get("profile");
        assertTrue(profileEntry.getOffset() > 0);
        assertEquals(2, profileEntry.getVersion());
        
        // 5. Test Self-Healing Index Rebuild
        java.nio.file.Files.delete(indexFile.toPath());
        historyService.archiveSnapshot(snapshot); // Should trigger rebuild
        assertTrue(indexFile.exists());
        
        index = objectMapper.readValue(indexFile, new TypeReference<Map<String, FundamentalHistoryService.HistoryIndexEntry>>() {});
        profileEntry = index.get("profile");
        assertTrue(profileEntry.getOffset() > 0);
        assertEquals(2, profileEntry.getVersion());
    }
}
