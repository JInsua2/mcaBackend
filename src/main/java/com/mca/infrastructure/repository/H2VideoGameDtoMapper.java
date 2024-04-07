package com.mca.infrastructure.repository;

import com.mca.domain.VideoGame;
import com.mca.infrastructure.repository.dtos.PromotionDto;
import com.mca.infrastructure.repository.dtos.SagaDto;
import com.mca.infrastructure.repository.dtos.StockDto;
import com.mca.infrastructure.repository.dtos.VideoGameDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface H2VideoGameDtoMapper {

    @Mapping(target = "id", expression = "java(new VideoGameId(videoGameDto.getId().intValue()))")
    @Mapping(target = "videoGamePrice", expression = "java(new VideoGamePrice(promotionDto.getPrice().floatValue()))")
    @Mapping(target = "videoGameSagaId", expression = "java(new VideoGameSagaId(sagaDto.getId().intValue()))")
    @Mapping(target = "videoGameStock", expression = "java(new VideoGameStock(stockDto.getAvailability()))")
    @Mapping(target = "videoGameTittle", expression = "java(new VideoGameTittle(videoGameDto.getTitle()))")
    VideoGame toDomain(SagaDto sagaDto, VideoGameDto videoGameDto, StockDto stockDto, PromotionDto promotionDto);
}
