package com.mca.domain.videogame;

import com.mca.domain.shared.AggregateRoot;
import com.mca.domain.shared.ValueObject;
import com.mca.domain.videogame.stock.Stock;
import com.mca.domain.videogame.vos.VideoGameId;
import com.mca.domain.videogame.vos.VideoGamePrice;
import com.mca.domain.videogame.vos.VideoGameSagaId;
import com.mca.domain.videogame.vos.VideoGameTitle;
import java.util.List;

public class VideoGame extends AggregateRoot<VideoGameId> {

    private final List<VideoGamePrice> videoGamePrice;
    private final VideoGameSagaId videoGameSagaId;
    private final Stock videoGameStock;
    private final VideoGameTitle videoGameTitle;

    public VideoGame(
        VideoGameId id,
        VideoGamePrice videoGamePrice,
        VideoGameSagaId videoGameSagaId,
        Stock videoGameStock,
        VideoGameTitle videoGameTitle) {

        super(id);
        this.videoGamePrice = videoGamePrice;
        this.videoGameSagaId = videoGameSagaId;
        this.videoGameStock = videoGameStock;
        this.videoGameTitle = videoGameTitle;
        this.ensureAttributeIsNotNull(videoGamePrice);
        this.ensureAttributeIsNotNull(videoGameSagaId);
        this.ensureAttributeIsNotNull(videoGameStock);
        this.ensureAttributeIsNotNull(videoGameTitle);

    }

    public VideoGamePrimitives toPrimitives() {
        return new VideoGamePrimitives(
            this.id.getValue(),
            this.videoGamePrice.stream().map(ValueObject::getValue).toList(),
            this.videoGameSagaId.getValue(),
            this.videoGameTitle.getValue(),
            this.videoGameStock.toPrimitives());
    }
}
