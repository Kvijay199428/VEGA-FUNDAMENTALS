package com.vega.fundamentals.util;

import com.vega.fundamentals.dto.SectionResponse;
import java.time.Duration;
import java.time.Instant;

public class SectionResponseFactory {

    public static <T> SectionResponse<T> success(T data) {
        return SectionResponse.<T>builder()
                .status("success")
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> error(String errorCode, String message, T data) {
        return SectionResponse.<T>builder()
                .status("error")
                .errorCode(errorCode)
                .message(message)
                .fetchedTs(Instant.now())
                .data(data)
                .build();
    }

    public static <T> SectionResponse<T> cached(T data, Instant fetchedTs) {
        SectionResponse<T> response = SectionResponse.<T>builder()
                .status("cached")
                .fetchedTs(fetchedTs)
                .cacheHit(true)
                .data(data)
                .build();
        
        if (fetchedTs != null) {
            response.setAgeMinutes(Duration.between(fetchedTs, Instant.now()).toMinutes());
        }
        
        return response;
    }
}
