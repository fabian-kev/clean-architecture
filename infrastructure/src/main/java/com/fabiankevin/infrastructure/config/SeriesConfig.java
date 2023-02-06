package com.fabiankevin.infrastructure.config;


import com.fabiankevin.core.SeriesRepository;
import com.fabiankevin.core.usecase.DefaultGetSeries;
import com.fabiankevin.core.usecase.GetSeries;
import com.fabiankevin.infrastructure.entities.JooqSeriesRepository;
import org.jooq.DSLContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeriesConfig {

    @Bean
    public SeriesRepository defaultSeriesRepository(DSLContext dslContext){
        return new JooqSeriesRepository(dslContext);
    }

    @Bean
    public GetSeries defaultGetSeries(SeriesRepository seriesRepository){
        return new DefaultGetSeries(seriesRepository);
    }
}
