package com.mca.domain.videogame;

import com.mca.domain.shared.Repository;
import com.mca.domain.videogame.stock.vos.StockAvailability;
import com.mca.domain.videogame.stock.vos.StockId;
import com.mca.domain.videogame.stock.vos.StockTime;
import com.mca.domain.videogame.vos.VideoGameId;
import com.mca.domain.videogame.vos.VideoGameSagaId;
import java.util.List;

public interface VideoGameRepository extends Repository<VideoGame, VideoGameId> {

    List<VideoGame> findBySaga(final VideoGameSagaId videoGameSagaId);


    void updateStock(
        final StockId stockId,
        final StockAvailability stockAvailability,
        final StockTime stockTime);
}
