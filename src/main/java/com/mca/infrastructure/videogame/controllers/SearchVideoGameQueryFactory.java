package com.mca.infrastructure.videogame.controllers;

import com.mca.domain.videogame.queries.SearchVideoGameSagaQuery;
import com.mca.domain.videogame.vos.PriceDateTime;
import com.mca.domain.videogame.vos.VideoGameSagaId;
import java.time.LocalDateTime;

public class SearchVideoGameQueryFactory {

    private SearchVideoGameQueryFactory() {
    }

    public static SearchVideoGameSagaQuery create(
        final Integer sagaId) {

        VideoGameSagaId videoGameSagaId = new VideoGameSagaId(sagaId.longValue());
        LocalDateTime localDateTime = LocalDateTime.now();
        PriceDateTime priceStartDate = new PriceDateTime(localDateTime);
        return new SearchVideoGameSagaQuery(videoGameSagaId, priceStartDate);
    }

}
