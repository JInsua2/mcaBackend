package com.mca.infrastructure.repository;

import com.mca.infrastructure.repository.dtos.PromotionDto;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPromotionDao extends JpaRepository<PromotionDto, Integer> {


    @Query("SELECT p FROM PromotionDto p WHERE p.videoGame.id = :videoGameId AND p.validFrom < :time")
    List<PromotionDto> findPromotionsByVideoGameIdAndTimeAfter(Long videoGameId, Timestamp time);
}
