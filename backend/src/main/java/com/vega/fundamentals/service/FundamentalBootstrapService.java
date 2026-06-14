package com.vega.fundamentals.service;

import com.vega.fundamentals.dto.FundamentalSnapshot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalBootstrapService {

    private final InstrumentService instrumentService;
    private final FundamentalAggregatorService aggregatorService;
    private final ExecutorService executor;

    public BootstrapResult bootstrapFno() {
        log.info("Starting F&O bootstrap process...");
        Map<String, InstrumentService.InstrumentInfo> fnoEquities = instrumentService.getFnoEquities();
        int total = fnoEquities.size();
        log.info("Found {} F&O equities to bootstrap.", total);

        AtomicInteger successCount = new AtomicInteger(0);
        AtomicInteger failureCount = new AtomicInteger(0);
        List<String> failedIsins = new ArrayList<>();

        List<CompletableFuture<Void>> futures = fnoEquities.values().stream()
                .map(info -> CompletableFuture.runAsync(() -> {
                    try {
                        aggregatorService.aggregate(info.getIsin());
                        successCount.incrementAndGet();
                        log.info("[BOOTSTRAP] Successfully processed {} ({})", info.getIsin(), info.getSymbol());
                    } catch (Exception e) {
                        failureCount.incrementAndGet();
                        failedIsins.add(info.getIsin());
                        log.error("[BOOTSTRAP] Failed to process {} ({}): {}", info.getIsin(), info.getSymbol(), e.getMessage());
                    }
                }, executor))
                .toList();

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();

        log.info("Bootstrap complete. Total: {}, Success: {}, Failed: {}", total, successCount.get(), failureCount.get());

        return new BootstrapResult(total, successCount.get(), failureCount.get(), failedIsins);
    }

    public record BootstrapResult(int total, int success, int failed, List<String> failedIsins) {}
}
