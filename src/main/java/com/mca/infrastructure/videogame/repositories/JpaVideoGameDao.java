package com.mca.infrastructure.videogame.repositories;

import com.mca.infrastructure.videogame.repositories.dtos.VideoGameDto;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface JpaVideoGameDao extends JpaRepository<VideoGameDto, Integer> {
    List<VideoGameDto> findBySaga_Id(final Long id);

    @Modifying
    @Transactional
    @Query("UPDATE StockDto s SET s.availability = :availability, s.lastUpdated = :lastUpdated WHERE s.id = :stockId")
    void updateStock(Long stockId, Boolean availability, Timestamp lastUpdated);

}
