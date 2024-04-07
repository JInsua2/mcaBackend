package com.mca.infrastructure.repository;

import com.mca.infrastructure.repository.dtos.VideoGameDto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaVideoGameDao extends JpaRepository<VideoGameDto, Integer> {



    List<VideoGameDto> findBySaga_Id(Long id);
}
