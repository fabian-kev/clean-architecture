package com.fabiankevin.core.usecase;

import com.fabiankevin.core.SeriesRepository;
import com.fabiankevin.core.model.Series;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DefaultGetSeries implements GetSeries {
    private final SeriesRepository seriesRepository;
    @Override
    public List<Series> execute() {
        return seriesRepository.findAll();
    }
}
