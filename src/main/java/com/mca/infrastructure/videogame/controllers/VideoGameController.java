package com.mca.infrastructure.videogame.controllers;

import com.mca.domain.videogame.usecases.SearchVideoGamesUseCase;
import com.mca.domain.videogame.VideoGame;
import com.mca.domain.videogame.VideoGamePrimitives;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.openapitools.api.GameSagasApi;
import org.openapitools.model.VideoGameSagaResponseInner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoGameController implements GameSagasApi {

    private final SearchVideoGamesUseCase searchVideoGamesUseCase;
    //private final VideoGameDtoMapper videoGameDtoMapper;

    public VideoGameController(final SearchVideoGamesUseCase searchVideoGames) {
        this.searchVideoGamesUseCase = searchVideoGames;
    }


    @Override
    public ResponseEntity<List<VideoGameSagaResponseInner>> getGameSagaRelatedSagas(Integer sagaId) {
        final var query = SearchVideoGameQueryFactory.create(sagaId);
        List<VideoGame> videoGames = searchVideoGamesUseCase.handle(query);

        List<VideoGamePrimitives> videoGamePrimitivesCollection = videoGames.stream()
            .map(VideoGame::toPrimitives)
            .toList();
        //return ResponseEntity.ok(this.videoGameDtoMapper.fromDomain(videoGamePrimitivesCollection));
        return ResponseEntity.ok(null);

    }

}
