package com.fabiankevin.infrastructure.entities;

import com.fabiankevin.core.SeriesRepository;
import com.fabiankevin.core.model.Series;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
public class JooqSeriesRepository implements SeriesRepository {
    private final DSLContext dslContext;

    @Override
    public List<Series> findAll() {
        return List.of(Series.builder()
                        .id(UUID.randomUUID())
                        .name("The Last of Us")
                        .genre(List.of("fantasy", "zombie"))
                .build());
    }
}
