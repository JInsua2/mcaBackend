package com.mca.application.videogame;

import com.mca.domain.videogame.queries.SearchVideoGameSagaQuery;
import com.mca.domain.videogame.usecases.SearchVideoGamesUseCase;
import com.mca.domain.videogame.VideoGame;
import com.mca.domain.videogame.VideoGameRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class SearchVideoGameSagaUseCaseHandle implements SearchVideoGamesUseCase {

    private final VideoGameRepository videoGameRepository;

    public SearchVideoGameSagaUseCaseHandle(VideoGameRepository videoGameRepository){
        this.videoGameRepository = videoGameRepository;
    }

    @Override
    public List<VideoGame> handle(SearchVideoGameSagaQuery searchVideoGameSagaQuery) {

        return videoGameRepository.findBySaga(searchVideoGameSagaQuery.videoGameSagaId());
    }
}
