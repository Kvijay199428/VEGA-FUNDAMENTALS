package com.vega.fundamentals.service;

import com.vega.fundamentals.dto.FundamentalFetchJob;
import com.vega.fundamentals.dto.FundamentalSnapshot;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class FundamentalFetchScheduler {

    private final FundamentalFetchQueueService queueService;
    private final FundamentalAggregatorService aggregatorService;

    // Default to 1000ms if not configured
    @Scheduled(fixedRateString = "#{@environment.getProperty('fundamentals.queue.fetch-rate-seconds', '1')}000")
    public void processNextJob() {
        FundamentalFetchJob job = queueService.dequeue();
        if (job == null) {
            return;
        }

        try {
            log.info("Scheduler executing fetch for ISIN: {} (Source: {})", job.getIsin(), job.getSource());
            FundamentalSnapshot snapshot = aggregatorService.aggregate(job.getIsin());
            
            boolean hasErrors = "error".equals(snapshot.getStatus());
            queueService.markComplete(job.getIsin(), !hasErrors);
            
            if (hasErrors) {
                log.warn("Scheduler finished fetch for ISIN: {} with errors.", job.getIsin());
            } else {
                log.info("Scheduler successfully completed fetch for ISIN: {}", job.getIsin());
            }
        } catch (Exception e) {
            log.error("Scheduler failed to aggregate ISIN: {}", job.getIsin(), e);
            queueService.markComplete(job.getIsin(), false);
        }
    }
}
