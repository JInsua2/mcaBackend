package com.mca.domain.videogame.usecases;

import com.mca.domain.videogame.queries.SearchVideoGameSagaQuery;
import com.mca.domain.videogame.VideoGame;
import java.util.List;


public interface SearchVideoGamesUseCase {
    List<VideoGame> handle(final SearchVideoGameSagaQuery searchVideoGameSagaQuery);
}
