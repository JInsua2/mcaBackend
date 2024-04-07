package com.mca.infrastructure.controller.videoGameSaga;

import com.mca.domain.RetrieveVideoGameQuery;
import com.mca.domain.vos.PriceDateTime;
import com.mca.domain.vos.VideoGameSaga;
import java.time.LocalDateTime;

public class RetrieveVideoGameQueryFactory {

    private RetrieveVideoGameQueryFactory() {
    }

    public static RetrieveVideoGameQuery create(
        final Integer sagaId) {

        VideoGameSaga videoGameSaga = new VideoGameSaga(sagaId);
        LocalDateTime localDateTime = LocalDateTime.now();
        PriceDateTime priceStartDate = new PriceDateTime(localDateTime);

        return new RetrieveVideoGameQuery(videoGameSaga, priceStartDate);
    }

}
