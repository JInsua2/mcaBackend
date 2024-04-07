package com.mca.domain;

import com.mca.domain.vos.PriceDateTime;
import com.mca.domain.vos.VideoGameSagaId;

public record RetrieveVideoGameSagaQuery(
        VideoGameSagaId videoGameSagaId,
        PriceDateTime priceDateTime
) {

}
