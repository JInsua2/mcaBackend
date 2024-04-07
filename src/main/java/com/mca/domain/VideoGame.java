package com.mca.domain;

import com.mca.domain.shared.AggregateRoot;
import com.mca.domain.vos.VideoGameId;
import com.mca.domain.vos.VideoGamePrice;
import com.mca.domain.vos.VideoGameSagaId;
import com.mca.domain.vos.VideoGameStock;
import com.mca.domain.vos.VideoGameTittle;

public class VideoGame extends AggregateRoot<VideoGameId> {

    private final VideoGameId id;
    private final VideoGamePrice videoGamePrice;
    private final VideoGameSagaId videoGameSagaId;
    private final VideoGameStock videoGameStock;
    private final VideoGameTittle videoGameTittle;

    public VideoGame(
        VideoGameId id,
        VideoGamePrice videoGamePrice,
        VideoGameSagaId videoGameSagaId,
        VideoGameStock videoGameStock,
        VideoGameTittle videoGameTittle) {

        super(id);
        this.id = id;
        this.videoGamePrice = videoGamePrice;
        this.videoGameSagaId = videoGameSagaId;
        this.videoGameStock = videoGameStock;
        this.videoGameTittle = videoGameTittle;

    }

    public VideoGamePrimitives toPrimitives() {
        return new VideoGamePrimitives(
            this.getId().getValue(),
            this.videoGamePrice.getValue(),
            this.videoGameSagaId.getValue(),
            this.videoGameStock.getValue(),
            this.videoGameTittle.getValue());
    }
}
