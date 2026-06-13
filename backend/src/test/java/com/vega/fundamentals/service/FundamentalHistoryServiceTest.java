package com.vega.fundamentals.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.dto.CompanyProfileDto;
import com.vega.fundamentals.dto.FundamentalSnapshot;
import com.vega.fundamentals.dto.SectionResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
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
        // Set history path to a subdirectory of tempDir
        historyService = new FundamentalHistoryService(tempDir.resolve("history").toString(), objectMapper);
    }

    @Test
    void testArchiveAndReconstruct() throws IOException {
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
        
        // First archive
        historyService.archiveSnapshot(snapshot);
        
        // Verify files exist in history path
        assertTrue(tempDir.resolve("history/INE001A01011/profile.jsonl").toFile().exists());
        assertTrue(tempDir.resolve("history/INE001A01011/metadata.json").toFile().exists());
        assertTrue(tempDir.resolve("history/INE001A01011/latest-index.json").toFile().exists());
        
        // Reconstruct
        Optional<FundamentalSnapshot> reconstructed = historyService.reconstructSnapshot(isin);
        assertTrue(reconstructed.isPresent());
        assertEquals("Technology", reconstructed.get().getProfile().getData().getSector());
        assertEquals("HISTORY", reconstructed.get().getSource());
        
        // Archive same data but different fetchedTs (should NOT append due to recursive normalization)
        long initialSize = tempDir.resolve("history/INE001A01011/profile.jsonl").toFile().length();
        profile.setFetchedTs(Instant.now().plusSeconds(3600));
        snapshot.setProfile(SectionResponse.success(profile));
        historyService.archiveSnapshot(snapshot);
        assertEquals(initialSize, tempDir.resolve("history/INE001A01011/profile.jsonl").toFile().length());
        
        // Archive changed data
        profile.setSector("Energy");
        snapshot.setProfile(SectionResponse.success(profile));
        historyService.archiveSnapshot(snapshot);
        assertTrue(tempDir.resolve("history/INE001A01011/profile.jsonl").toFile().length() > initialSize);
        
        // Test Index Rebuild
        Path indexPath = tempDir.resolve("history/INE001A01011/latest-index.json");
        java.nio.file.Files.delete(indexPath);
        assertFalse(indexPath.toFile().exists());
        
        // Archiving again should trigger rebuild
        historyService.archiveSnapshot(snapshot);
        assertTrue(indexPath.toFile().exists());
        
        // Reconstruct after rebuild
        reconstructed = historyService.reconstructSnapshot(isin);
        assertEquals("Energy", reconstructed.get().getProfile().getData().getSector());
    }
}
