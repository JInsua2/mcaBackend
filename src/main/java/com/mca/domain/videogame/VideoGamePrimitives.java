package com.mca.domain.videogame;

import com.mca.domain.videogame.stock.StockPrimitives;
import java.util.List;

public class VideoGamePrimitives {

    private final Long id;
    private final Double videoGamePrice;
    private final Long videoGameSaga;
    private final StockPrimitives videoGameStock;
    private final String videoGameTitle;

    public VideoGamePrimitives(
        Long id,
        Double videoGamePrice,
        Long videoGameSaga,
        String videoGameTitle,
        StockPrimitives videoGameStock) {
        this.id = id;
        this.videoGamePrice = videoGamePrice;
        this.videoGameSaga = videoGameSaga;
        this.videoGameTitle = videoGameTitle;
        this.videoGameStock = videoGameStock;
    }

    public Integer getId() {
        return id;
    }

    public Double getVideoGamePrice() {
        return videoGamePrice;
    }

    public Integer getVideoGameSaga() {
        return videoGameSaga;
    }

    public StockPrimitives getVideoGameStock() {
        return videoGameStock;
    }

    public String getVideoGameTitle() {
        return videoGameTitle;
    }
}
