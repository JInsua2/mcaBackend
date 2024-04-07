package com.mca.domain;

import com.mca.domain.vos.PriceDateTime;
import com.mca.domain.vos.VideoGameId;
import com.mca.domain.shared.Repository;
import com.mca.domain.vos.VideoGameSaga;

public interface VideoGameRepository extends Repository<VideoGame, VideoGameId> {

    VideoGame findActivePrice(
        final VideoGameId brandId,
        final VideoGameSaga productId,
        final PriceDateTime time);
}
