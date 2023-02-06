package com.fabiankevin.core;

import com.fabiankevin.core.model.Series;

import java.util.List;

public interface SeriesRepository {
    List<Series> findAll();
}
