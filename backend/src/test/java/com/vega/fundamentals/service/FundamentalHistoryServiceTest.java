package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.dto.*;
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
    void testArchiveAndReconstructWithMetadataOffsets() throws IOException {
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
        
        // 2. Verify Metadata in metadata.json
        File metadataFile = tempDir.resolve("history/INE001A01011/metadata.json").toFile();
        assertTrue(metadataFile.exists());
        
        IsinMetadata metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
        IsinMetadata.EndpointMetadata profileMeta = metadata.getEndpoints().get("profile");
        assertNotNull(profileMeta);
        assertEquals(0, profileMeta.getOffset()); 
        assertEquals(1, profileMeta.getVersion());
        
        // 3. Reconstruct (should use metadata offsets)
        Optional<FundamentalSnapshot> reconstructed = historyService.reconstructSnapshot(isin);
        assertTrue(reconstructed.isPresent());
        assertEquals("Technology", reconstructed.get().getProfile().getData().getSector());
        assertEquals("HISTORY", reconstructed.get().getSource());
        
        // 4. Archive Identical Data (Deduplication Check)
        profile.setFetchedTs(Instant.now().plusSeconds(60)); // Change timestamp only
        snapshot.setProfile(SectionResponse.success(profile));
        historyService.archiveSnapshot(snapshot);
        
        metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
        profileMeta = metadata.getEndpoints().get("profile");
        assertEquals(1, profileMeta.getVersion()); // Version should NOT increment
        
        // 5. Archive Changed Data
        profile.setSector("Energy");
        snapshot.setProfile(SectionResponse.success(profile));
        historyService.archiveSnapshot(snapshot);
        
        metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
        profileMeta = metadata.getEndpoints().get("profile");
        assertEquals(2, profileMeta.getVersion());
        assertTrue(profileMeta.getOffset() > 0);
        
        // 6. Test Metadata Rebuild
        java.nio.file.Files.delete(metadataFile.toPath());
        historyService.archiveSnapshot(snapshot); // Should trigger rebuild from JSONL
        assertTrue(metadataFile.exists());
        
        metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
        profileMeta = metadata.getEndpoints().get("profile");
        assertEquals(2, profileMeta.getVersion());
    }
}
