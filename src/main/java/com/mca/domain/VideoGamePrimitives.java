package com.mca.domain;

public class VideoGamePrimitives {

    private final Integer id;
    private final double videoGamePrice;
    private final Integer videoGameSaga;
    private final Boolean videoGameStock;
    private final String videoGameTittle;

    public VideoGamePrimitives(
        Integer id,
        double videoGamePrice,
        Integer videoGameSaga,
        Boolean videoGameStock,
        String videoGameTittle) {
        this.id = id;
        this.videoGamePrice = videoGamePrice;
        this.videoGameSaga = videoGameSaga;
        this.videoGameStock = videoGameStock;
        this.videoGameTittle = videoGameTittle;
    }

    public Integer getId() {
        return id;
    }

    public double getVideoGamePrice() {
        return videoGamePrice;
    }

    public Integer getVideoGameSaga() {
        return videoGameSaga;
    }

    public Boolean getVideoGameStock() {
        return videoGameStock;
    }

    public String getVideoGameTittle() {
        return videoGameTittle;
    }
}
