package com.mca.infrastructure.videogame.repositories;

import com.mca.domain.videogame.VideoGame;
import com.mca.domain.videogame.VideoGameCriteria;
import com.mca.domain.videogame.VideoGamePrimitives;
import com.mca.domain.videogame.VideoGameRepository;
import com.mca.domain.videogame.stock.StockPrimitives;
import com.mca.domain.videogame.stock.vos.StockAvailability;
import com.mca.domain.videogame.stock.vos.StockId;
import com.mca.domain.videogame.stock.vos.StockTime;
import com.mca.domain.videogame.vos.PriceDateTime;
import com.mca.domain.videogame.vos.VideoGameId;
import com.mca.domain.videogame.vos.VideoGameSagaId;
import com.mca.infrastructure.videogame.repositories.dtos.PromotionDto;
import com.mca.infrastructure.videogame.repositories.dtos.StockDto;
import com.mca.infrastructure.videogame.repositories.dtos.VideoGameDto;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class H2VideoGameRepository implements VideoGameRepository {

    private final JpaSagaDao jpaSagaDao;
    private final JpaVideoGameDao jpaVideoGameDao;
    private final H2VideoGameDtoMapper h2VideoGameDtoMapper;

    public H2VideoGameRepository(
        JpaVideoGameDao jpaVideoGameDao,
        H2VideoGameDtoMapper h2VideoGameDtoMapper) {

        this.jpaVideoGameDao = jpaVideoGameDao;
        this.h2VideoGameDtoMapper = h2VideoGameDtoMapper;
    }

    @Override
    public List<VideoGame> findBySaga(VideoGameSagaId videoGameSagaId) {
        final List<VideoGameDto>  videoGameDtos = this.jpaVideoGameDao.findBySaga_Id(videoGameSagaId.getValue());
        List<VideoGamePrimitives> videoGamePrimitiveCollection = videoGameDtos.stream().map(this::buildVideoGamePrimitives).toList();
        return this.h2VideoGameDtoMapper.toDomain(videoGamePrimitiveCollection);

    }

    @Override
    public List<VideoGame> findActiveVideoGameSaga(VideoGameSagaId videoGameSagaId, PriceDateTime time) {
        return null;
    }

    @Override
    public VideoGame findActiveVideoGame(VideoGameId videoGameId, PriceDateTime time) {
        return null;
    }

    @Override
    public VideoGame findById(VideoGameId id) {
        return null;
    }

    @Override
    public List<VideoGame> findAll() {
        return null;
    }

    @Override
    public void create(VideoGame aggregateRoot) {

    }

    @Override
    public void update(VideoGame aggregateRoot) {

    }

    @Override
    public void delete(VideoGame aggregateRoot) {

    }
}
