package com.mca.infrastructure.videogame.controllers;

import com.mca.domain.videogame.VideoGamePrimitives;
import java.math.BigDecimal;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.openapitools.model.VideoGameSagaResponseInner;

@Mapper(componentModel = "spring")
public interface VideoGameDtoMapper {

    @Mapping(source = "id", target = "videoGameId")
    @Mapping(source = "videoGamePrice", target = "price", qualifiedByName = "doubleToBigDecimal")
    @Mapping(expression = "java(videoGame.getVideoGameStock().getAvailability())", target = "stock")
    @Mapping(source = "videoGameTitle", target = "title")
    VideoGameSagaResponseInner fromDomain(VideoGamePrimitives videoGame);

    List<VideoGameSagaResponseInner> fromDomain(List<VideoGamePrimitives> videoGames);

    @Named("doubleToBigDecimal")
    default BigDecimal doubleToBigDecimal(Double videoGamePrice) {
        return videoGamePrice == null ? null : BigDecimal.valueOf(videoGamePrice);
    }
}
