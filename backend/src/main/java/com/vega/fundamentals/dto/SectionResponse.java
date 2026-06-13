package com.vega.fundamentals.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionResponse<T> {
    private String status;
    private Instant fetchedTs;
    private Long ageMinutes;
    private Boolean cacheHit;
    private String errorCode;
    private String message;
    private T data;

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
        return SectionResponse.<T>builder()
                .status("cached")
                .fetchedTs(fetchedTs)
                .cacheHit(true)
                .data(data)
                .build();
    }
}
