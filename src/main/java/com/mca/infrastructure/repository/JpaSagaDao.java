package com.mca.infrastructure.repository;

import com.mca.infrastructure.repository.dtos.PromotionDto;
import com.mca.infrastructure.repository.dtos.SagaDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaSagaDao extends JpaRepository<SagaDto, Integer> {

}
