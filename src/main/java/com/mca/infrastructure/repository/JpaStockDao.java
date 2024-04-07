package com.mca.infrastructure.repository;

import com.mca.infrastructure.repository.dtos.PromotionDto;
import com.mca.infrastructure.repository.dtos.StockDto;
import com.mca.infrastructure.repository.dtos.VideoGameDto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaStockDao extends JpaRepository<StockDto, Integer> {

    Optional<StockDto> findByVideoGame_Id(Long id);
}
