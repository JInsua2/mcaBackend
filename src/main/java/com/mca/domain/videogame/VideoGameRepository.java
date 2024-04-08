package com.mca.domain.videogame;

import com.mca.domain.videogame.vos.PriceDateTime;
import com.mca.domain.videogame.vos.VideoGameId;
import com.mca.domain.shared.Repository;
import com.mca.domain.videogame.vos.VideoGameSagaId;
import java.util.List;

public interface VideoGameRepository extends Repository<VideoGame, VideoGameId> {

    List<VideoGame> findActiveVideoGameSaga(
        final VideoGameSagaId videoGameSagaId,
        final PriceDateTime time);

    VideoGame findActiveVideoGame(
        final VideoGameId videoGameId,
        final PriceDateTime time);
}
