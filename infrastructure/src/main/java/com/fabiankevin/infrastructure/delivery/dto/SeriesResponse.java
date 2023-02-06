package com.fabiankevin.infrastructure.delivery.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SeriesResponse {
    private UUID id;
    private String name;
    private List<String> genre;
}
