package com.mca.infrastructure.repository;

import com.mca.domain.VideoGame;
import com.mca.domain.VideoGameRepository;
import com.mca.domain.vos.PriceDateTime;
import com.mca.domain.vos.VideoGameId;
import com.mca.domain.vos.VideoGameSagaId;
import com.mca.infrastructure.repository.dtos.PromotionDto;
import com.mca.infrastructure.repository.dtos.SagaDto;
import com.mca.infrastructure.repository.dtos.StockDto;
import com.mca.infrastructure.repository.dtos.VideoGameDto;
import jakarta.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository
public class H2VideoGameRepository implements VideoGameRepository {

    private final JpaSagaDao jpaSagaDao;
    private final JpaVideoGameDao jpaVideoGameDao;
    private final JpaStockDao jpaStockDao;
    private final JpaPromotionDao jpaPromotionDao;
    private final H2VideoGameDtoMapper h2VideoGameDtoMapper;

    public H2VideoGameRepository(
        JpaSagaDao jpaSagaDao,
        JpaVideoGameDao jpaVideoGameDao,
        JpaStockDao jpaStockDao,
        JpaPromotionDao jpaPromotionDao,
        H2VideoGameDtoMapper h2VideoGameDtoMapper) {

        this.jpaSagaDao = jpaSagaDao;
        this.jpaVideoGameDao = jpaVideoGameDao;
        this.jpaStockDao = jpaStockDao;
        this.jpaPromotionDao = jpaPromotionDao;
        this.h2VideoGameDtoMapper = h2VideoGameDtoMapper;
    }

    @Cacheable("videoGames")
    public List<VideoGame> findActiveVideoGameSaga(VideoGameSagaId videoGameSagaId, PriceDateTime time) {
        SagaDto sagaDto = jpaSagaDao.findById(videoGameSagaId.getValue())
            .orElseThrow(() -> new EntityNotFoundException("Saga not found"));

        List<VideoGameDto> videoGameDtos = jpaVideoGameDao.findBySaga_Id(sagaDto.getId());
        Timestamp timestamp = Timestamp.valueOf(time.getValue());

        return videoGameDtos.stream().map(videoGameDto -> {
            StockDto stockDto = jpaStockDao.findByVideoGame_Id(videoGameDto.getId())
                .orElseThrow(() -> new EntityNotFoundException("Stock not found"));

            List<PromotionDto> promotions = jpaPromotionDao.findPromotionsByVideoGameIdAndTimeAfter(videoGameDto.getId(), timestamp);
            PromotionDto promotionDto = promotions.stream()
                .max(Comparator.comparing(PromotionDto::getValidFrom))
                .orElseGet(this::createDefaultPromotionDto);

            return h2VideoGameDtoMapper.toDomain(sagaDto, videoGameDto, stockDto, promotionDto);
        }).toList();
    }

    private PromotionDto createDefaultPromotionDto() {
        PromotionDto defaultPromotionDto = new PromotionDto();
        defaultPromotionDto.setPrice(new BigDecimal("-1"));
        defaultPromotionDto.setValidFrom(new Timestamp(-1*System.currentTimeMillis()));
        return defaultPromotionDto;
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
