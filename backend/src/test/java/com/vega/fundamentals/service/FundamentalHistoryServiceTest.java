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

    @Test
    void testMetadataProvenanceRecovery() throws IOException {
        String isin = "INE001A01011";
        Instant firstTs = Instant.parse("2026-01-01T10:00:00Z");
        
        CompanyProfileDto profile = new CompanyProfileDto();
        profile.setSector("Tech");
        
        // Manually create a history record with a specific timestamp
        HistoryRecord record = HistoryRecord.builder()
                .version(1)
                .ts(firstTs)
                .hash("abc")
                .data(objectMapper.valueToTree(profile))
                .build();
        
        Path isinDir = tempDir.resolve("history").resolve(isin);
        java.nio.file.Files.createDirectories(isinDir);
        java.nio.file.Files.writeString(isinDir.resolve("profile.jsonl"), objectMapper.writeValueAsString(record) + "\n");
        
        // Rebuild metadata
        IsinMetadata recovered = historyService.rebuildMetadataFromHistory(isin);
        
        assertEquals(firstTs, recovered.getFirstSeenTs(), "Should recover firstSeenTs from history");
        assertEquals(firstTs, recovered.getCreatedTs(), "Should recover createdTs from history");
        assertEquals(1, recovered.getEndpoints().get("profile").getVersion());
    }

    @Test
    void testCanonicalSortingDeduplication() {
        String isin = "INE001A01011";
        
        CompetitorDto c1 = new CompetitorDto(); c1.setInstrumentKey("A");
        CompetitorDto c2 = new CompetitorDto(); c2.setInstrumentKey("B");
        
        FundamentalSnapshot s1 = FundamentalSnapshot.builder()
                .isin(isin)
                .competitors(SectionResponse.success(java.util.List.of(c1, c2)))
                .build();
        
        historyService.archiveSnapshot(s1);
        
        // S2 has swapped order
        FundamentalSnapshot s2 = FundamentalSnapshot.builder()
                .isin(isin)
                .competitors(SectionResponse.success(java.util.List.of(c2, c1)))
                .build();
        
        historyService.archiveSnapshot(s2);
        
        File metadataFile = tempDir.resolve("history/INE001A01011/metadata.json").toFile();
        try {
            IsinMetadata metadata = objectMapper.readValue(metadataFile, IsinMetadata.class);
            assertEquals(1, metadata.getEndpoints().get("competitors").getVersion(), "Swapped order should not create new version");
        } catch (IOException e) {
            fail(e);
        }
    }

    @Test
    void testPointInTimeReconstruction() throws InterruptedException {
        String isin = "INE001A01011";
        CompanyProfileDto p1 = new CompanyProfileDto(); p1.setSector("Sector 1");
        
        FundamentalSnapshot s1 = FundamentalSnapshot.builder()
                .isin(isin)
                .profile(SectionResponse.success(p1))
                .build();
        
        historyService.archiveSnapshot(s1);
        Instant t1 = Instant.now();
        
        Thread.sleep(100); // Ensure timestamp difference
        
        CompanyProfileDto p2 = new CompanyProfileDto(); p2.setSector("Sector 2");
        FundamentalSnapshot s2 = FundamentalSnapshot.builder()
                .isin(isin)
                .profile(SectionResponse.success(p2))
                .build();
        historyService.archiveSnapshot(s2);
        
        // Reconstruct as of t1
        Optional<FundamentalSnapshot> snapshotT1 = historyService.reconstructSnapshot(isin, t1);
        assertTrue(snapshotT1.isPresent());
        assertEquals("Sector 1", snapshotT1.get().getProfile().getData().getSector());

        // Reconstruct as of now
        Optional<FundamentalSnapshot> snapshotNow = historyService.reconstructSnapshot(isin, Instant.now());
        assertTrue(snapshotNow.isPresent());
        assertEquals("Sector 2", snapshotNow.get().getProfile().getData().getSector());
    }

    @Test
    void testEmptyHistoryNotArchived() {
        String isin = "INE999A01011";
        // Create a snapshot with only failed endpoints
        FundamentalSnapshot failedSnapshot = FundamentalSnapshot.builder()
                .isin(isin)
                .profile(SectionResponse.error("TIMEOUT", "Failed to fetch", null))
                .balanceSheet(SectionResponse.error("TIMEOUT", "Failed to fetch", null))
                .build();

        historyService.archiveSnapshot(failedSnapshot);

        File metadataFile = tempDir.resolve("history/" + isin + "/metadata.json").toFile();
        assertFalse(metadataFile.exists(), "Metadata file should not be created for empty history");

        File isinDir = tempDir.resolve("history/" + isin).toFile();
        // Since no jsonl was created, the directory might exist if created early, but metadata should not.
    }

    @Test
    void testCleanupPoisonedDirectories() throws IOException {
        String isin = "INE888A01011";
        Path isinDir = tempDir.resolve("history").resolve(isin);
        java.nio.file.Files.createDirectories(isinDir);
        
        IsinMetadata poisonedMetadata = IsinMetadata.builder()
                .isin(isin)
                .endpoints(new java.util.HashMap<>()) // Empty endpoints
                .build();
                
        File metadataFile = isinDir.resolve("metadata.json").toFile();
        objectMapper.writeValue(metadataFile, poisonedMetadata);
        
        assertTrue(metadataFile.exists());
        
        // Run cleanup
        historyService.cleanupPoisonedDirectories();
        
        assertFalse(metadataFile.exists(), "Poisoned metadata should be deleted");
        assertFalse(isinDir.toFile().exists(), "Poisoned directory should be deleted");
    }
}
