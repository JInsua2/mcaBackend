package com.mca.infrastructure.controller.videoGameSaga;

import com.mca.domain.RetrieveVideoGameSagaQuery;
import com.mca.domain.vos.PriceDateTime;
import com.mca.domain.vos.VideoGameSagaId;
import java.time.LocalDateTime;

public class RetrieveVideoGameQueryFactory {

    private RetrieveVideoGameQueryFactory() {
    }

    public static RetrieveVideoGameSagaQuery create(
        final Integer sagaId) {

        VideoGameSagaId videoGameSagaId = new VideoGameSagaId(sagaId);
        LocalDateTime localDateTime = LocalDateTime.now();
        PriceDateTime priceStartDate = new PriceDateTime(localDateTime);
//todo 2
        return new RetrieveVideoGameSagaQuery(videoGameSagaId, priceStartDate);
    }

}
