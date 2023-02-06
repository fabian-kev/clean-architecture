package com.fabiankevin.infrastructure.delivery;

import com.fabiankevin.core.usecase.GetSeries;
import com.fabiankevin.infrastructure.delivery.dto.SeriesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("v1/series")
@RequiredArgsConstructor
public class SeriesController {

    private final GetSeries getSeries;

    @GetMapping
    List<SeriesResponse> getSeries(){
        return getSeries.execute().stream()
                .map(s -> SeriesResponse.builder()
                        .id(s.getId())
                        .genre(s.getGenre())
                        .name(s.getName())
                        .build())
                .collect(Collectors.toList());
    }
}
