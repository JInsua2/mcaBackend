package com.mca.infrastructure.controller.videoGameSaga;

import com.mca.domain.VideoGamePrimitives;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.openapitools.model.VideoGameSagaResponseInner;

@Mapper(componentModel = "spring")
public interface VideoGameResponseMapper {

    @Mapping(source = "id", target = "videoGameId")
    @Mapping(source = "videoGamePrice", target = "price")
    @Mapping(source = "videoGameStock", target = "stock")
    @Mapping(source = "videoGameTittle", target = "title")
    VideoGameSagaResponseInner mapToVideoGameSagaResponse(VideoGamePrimitives videoGame);

    default List<VideoGameSagaResponseInner> fromDomain(List<VideoGamePrimitives> videoGames) {
        return videoGames.stream().map(this::mapToVideoGameSagaResponse).collect(Collectors.toList());
    }

    @Named("bigDecimalToFloat")
    default Float bigDecimalToFloat(BigDecimal value) {
        return value == null ? null : value.floatValue();
    }

}

