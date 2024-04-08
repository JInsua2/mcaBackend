package com.mca.infrastructure.videogame.repositories;

import com.mca.domain.videogame.VideoGame;
import com.mca.infrastructure.videogame.repositories.dtos.PromotionDto;
import com.mca.infrastructure.videogame.repositories.dtos.SagaDto;
import com.mca.infrastructure.videogame.repositories.dtos.StockDto;
import com.mca.infrastructure.videogame.repositories.dtos.VideoGameDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface H2VideoGameDtoMapper {

    @Mapping(target = "id", expression = "java(new VideoGameId(videoGameDto.getId().intValue()))")
    @Mapping(target = "videoGamePrice", expression = "java(new VideoGamePrice(promotionDto.getPrice().doubleValue()))")
    @Mapping(target = "videoGameSagaId", expression = "java(new VideoGameSagaId(sagaDto.getId().intValue()))")
    @Mapping(target = "videoGameStock", expression = "java(null)")
    @Mapping(target = "videoGameTitle", expression = "java(new VideoGameTitle(videoGameDto.getTitle()))")
    VideoGame toDomain(SagaDto sagaDto, VideoGameDto videoGameDto, StockDto stockDto, PromotionDto promotionDto);
}
