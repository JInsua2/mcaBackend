package com.mca.infrastructure.videogame.repositories;

import com.mca.domain.videogame.VideoGame;
import com.mca.domain.videogame.VideoGamePrimitives;
import com.mca.domain.videogame.stock.Stock;
import com.mca.domain.videogame.stock.vos.StockAvailability;
import com.mca.domain.videogame.stock.vos.StockId;
import com.mca.domain.videogame.stock.vos.StockTime;
import com.mca.domain.videogame.vos.VideoGameId;
import com.mca.domain.videogame.vos.VideoGamePrice;
import com.mca.domain.videogame.vos.VideoGameSagaId;
import com.mca.domain.videogame.vos.VideoGameTitle;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface H2VideoGameDtoMapper {

    default VideoGame toDomain(VideoGamePrimitives videoGamePrimitives) {
        return new VideoGame(
            new VideoGameId(videoGamePrimitives.getId()),
            new VideoGamePrice(videoGamePrimitives.getVideoGamePrice()),
            new VideoGameSagaId(videoGamePrimitives.getVideoGameSaga()),
            createStock(videoGamePrimitives),
            new VideoGameTitle(videoGamePrimitives.getVideoGameTitle())
        );
    }

    default Stock createStock(VideoGamePrimitives videoGamePrimitives) {
        return new Stock(
            new StockId(videoGamePrimitives.getVideoGameStock().getId()),
            new StockAvailability(videoGamePrimitives.getVideoGameStock().getAvailability()),
            new StockTime(videoGamePrimitives.getVideoGameStock().getTime())
        );
    }

    List<VideoGame> toDomain(List<VideoGamePrimitives> videoGamePrimitives);
}