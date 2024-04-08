package com.mca.domain.videogame;

import com.mca.domain.videogame.stock.vos.StockId;
import com.mca.domain.videogame.vos.VideoGameSagaId;

public class VideoGameCriteria {
    private final VideoGameSagaId sagaId;
    private final StockId stockId;

    public VideoGameCriteria(VideoGameSagaId sagaId, StockId stockId) {
        this.sagaId = sagaId;
        this.stockId = stockId;
    }

    public VideoGameSagaId getSagaId() {
        return sagaId;
    }

    public StockId getStockId() {
        return stockId;
    }
}
