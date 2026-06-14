package com.vega.fundamentals.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vega.fundamentals.dto.FundamentalFetchJob;
import com.vega.fundamentals.dto.JobStatusResponse;
import com.vega.fundamentals.dto.QueueStatusResponse;
import com.vega.fundamentals.dto.MetricsResponse;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Slf4j
public class FundamentalFetchQueueService {

    private final PriorityBlockingQueue<FundamentalFetchJob> queue = new PriorityBlockingQueue<>();
    private final Set<String> queuedIsins = ConcurrentHashMap.newKeySet();
    private final Set<String> inProgressIsins = ConcurrentHashMap.newKeySet();

    private final AtomicLong totalProcessed = new AtomicLong(0);
    private final AtomicLong totalFailed = new AtomicLong(0);

    private final boolean enabled;
    private final int maxSize;
    private final int fetchRateSeconds;
    private final String queuePath;
    private final ObjectMapper objectMapper;

    public FundamentalFetchQueueService(
            @Value("${fundamentals.queue.enabled:true}") boolean enabled,
            @Value("${fundamentals.queue.max-size:10000}") int maxSize,
            @Value("${fundamentals.queue.fetch-rate-seconds:1}") int fetchRateSeconds,
            @Value("${storage.queue.path}") String queuePath,
            ObjectMapper objectMapper) {
        this.enabled = enabled;
        this.maxSize = maxSize;
        this.fetchRateSeconds = fetchRateSeconds;
        this.queuePath = queuePath;
        this.objectMapper = objectMapper;
    }

    @PostConstruct
    public void init() {
        if (!enabled) return;
        restoreQueue();
    }

    public JobStatusResponse enqueue(String isin, int priority, String source) {
        if (!enabled) {
            return JobStatusResponse.builder().status("queue_disabled").isin(isin).build();
        }

        if (inProgressIsins.contains(isin)) {
            return JobStatusResponse.builder().status("processing").isin(isin).build();
        }

        if (queuedIsins.contains(isin)) {
            return JobStatusResponse.builder().status("queued").isin(isin).position(getPosition(isin)).build();
        }

        if (queue.size() >= maxSize) {
            return JobStatusResponse.builder().status("queue_full").isin(isin).build();
        }

        FundamentalFetchJob job = FundamentalFetchJob.builder()
                .isin(isin)
                .priority(priority)
                .createdTs(Instant.now())
                .source(source)
                .build();

        queue.add(job);
        queuedIsins.add(isin);
        persistQueueAsync();

        return JobStatusResponse.builder().status("queued").isin(isin).position(getPosition(isin)).build();
    }

    public FundamentalFetchJob dequeue() {
        FundamentalFetchJob job = queue.poll();
        if (job != null) {
            queuedIsins.remove(job.getIsin());
            inProgressIsins.add(job.getIsin());
            persistQueueAsync();
        }
        return job;
    }

    public void markComplete(String isin, boolean success) {
        inProgressIsins.remove(isin);
        if (success) {
            totalProcessed.incrementAndGet();
        } else {
            totalFailed.incrementAndGet();
        }
    }

    public int getPosition(String isin) {
        if (!queuedIsins.contains(isin)) return -1;
        
        FundamentalFetchJob[] jobs = queue.toArray(new FundamentalFetchJob[0]);
        Arrays.sort(jobs);
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i].getIsin().equals(isin)) {
                return i + 1;
            }
        }
        return -1;
    }

    public JobStatusResponse getStatus(String isin) {
        if (inProgressIsins.contains(isin)) {
            return JobStatusResponse.builder().status("processing").isin(isin).build();
        }
        if (queuedIsins.contains(isin)) {
            return JobStatusResponse.builder().status("queued").isin(isin).position(getPosition(isin)).build();
        }
        return JobStatusResponse.builder().status("available").isin(isin).build();
    }

    public QueueStatusResponse getQueueStatus() {
        return QueueStatusResponse.builder()
                .queued(queue.size())
                .inProgress(inProgressIsins.size())
                .rate("1 instrument/" + fetchRateSeconds + "sec")
                .build();
    }

    public MetricsResponse getMetrics() {
        return MetricsResponse.builder()
                .queued(queue.size())
                .processed(totalProcessed.get())
                .failed(totalFailed.get())
                .queueMaxSize(maxSize)
                .build();
    }

    private synchronized void restoreQueue() {
        File file = Path.of(queuePath, "pending.json").toFile();
        if (!file.exists()) return;
        try {
            Map<String, List<String>> data = objectMapper.readValue(file, new TypeReference<>() {});
            List<String> pending = data.get("pending");
            if (pending != null) {
                for (String isin : pending) {
                    enqueue(isin, 5, "RESTORED");
                }
                log.info("Restored {} items from pending queue", pending.size());
            }
        } catch (IOException e) {
            log.error("Failed to restore queue from pending.json", e);
        }
    }

    private void persistQueueAsync() {
        java.util.concurrent.CompletableFuture.runAsync(this::persistQueue);
    }

    private synchronized void persistQueue() {
        try {
            Path path = Path.of(queuePath);
            Files.createDirectories(path);
            File file = path.resolve("pending.json").toFile();
            
            FundamentalFetchJob[] jobs = queue.toArray(new FundamentalFetchJob[0]);
            Arrays.sort(jobs);
            List<String> isins = Arrays.stream(jobs).map(FundamentalFetchJob::getIsin).toList();

            Map<String, List<String>> data = Map.of("pending", isins);
            objectMapper.writeValue(file, data);
        } catch (IOException e) {
            log.error("Failed to persist queue to pending.json", e);
        }
    }
}
