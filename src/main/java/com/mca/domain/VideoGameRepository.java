package com.mca.domain;

import com.mca.domain.vos.PriceDateTime;
import com.mca.domain.vos.VideoGameId;
import com.mca.domain.shared.Repository;
import com.mca.domain.vos.VideoGameSagaId;
import java.util.List;

public interface VideoGameRepository extends Repository<VideoGame, VideoGameId> {

    List<VideoGame> findActiveVideoGameSaga(
        final VideoGameSagaId videoGameSagaId,
        final PriceDateTime time);

    VideoGame findActiveVideoGame(
        final VideoGameId videoGameId,
        final PriceDateTime time);
}
