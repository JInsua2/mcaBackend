package com.mca.domain;

import com.mca.domain.vos.PriceDateTime;
import com.mca.domain.vos.VideoGameId;
import com.mca.domain.vos.VideoGameSaga;

public record RetrieveVideoGameQuery(
        VideoGameSaga videoGameSaga,
        PriceDateTime priceDateTime
) {

}
