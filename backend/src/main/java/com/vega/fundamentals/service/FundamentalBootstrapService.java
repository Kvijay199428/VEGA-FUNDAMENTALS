package com.vega.fundamentals.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalBootstrapService {

    private final InstrumentService instrumentService;
    private final FundamentalFetchQueueService queueService;

    public BootstrapResult bootstrapFno() {
        log.info("Starting F&O bootstrap process...");
        Map<String, InstrumentService.InstrumentInfo> fnoEquities = instrumentService.getFnoEquities();
        int total = fnoEquities.size();
        log.info("Found {} F&O equities to bootstrap. Queuing them up...", total);

        int queuedCount = 0;
        int failedCount = 0;
        List<String> failedIsins = new ArrayList<>();

        for (InstrumentService.InstrumentInfo info : fnoEquities.values()) {
            try {
                com.vega.fundamentals.dto.JobStatusResponse status = queueService.enqueue(info.getIsin(), 5, "BOOTSTRAP");
                if ("queue_full".equals(status.getStatus())) {
                    failedCount++;
                    failedIsins.add(info.getIsin());
                    log.warn("[BOOTSTRAP] Queue full. Failed to queue {} ({})", info.getIsin(), info.getSymbol());
                } else {
                    queuedCount++;
                }
            } catch (Exception e) {
                failedCount++;
                failedIsins.add(info.getIsin());
                log.error("[BOOTSTRAP] Failed to queue {} ({}): {}", info.getIsin(), info.getSymbol(), e.getMessage());
            }
        }

        log.info("Bootstrap enqueue complete. Total: {}, Queued: {}, Failed: {}", total, queuedCount, failedCount);

        return new BootstrapResult(total, queuedCount, failedCount, failedIsins);
    }

    public record BootstrapResult(int total, int success, int failed, List<String> failedIsins) {}
}
