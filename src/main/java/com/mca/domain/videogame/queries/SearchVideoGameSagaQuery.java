package com.mca.domain.videogame.queries;

import com.mca.domain.videogame.vos.PriceDateTime;
import com.mca.domain.videogame.vos.VideoGameSagaId;

public record SearchVideoGameSagaQuery(
        VideoGameSagaId videoGameSagaId,
        PriceDateTime priceDateTime
) {

}
