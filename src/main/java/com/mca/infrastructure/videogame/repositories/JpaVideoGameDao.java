package com.mca.infrastructure.videogame.repositories;

import com.mca.infrastructure.videogame.repositories.dtos.VideoGameDto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaVideoGameDao extends JpaRepository<VideoGameDto, Integer> {



    List<VideoGameDto> findBySaga_Id(Long id);
}
