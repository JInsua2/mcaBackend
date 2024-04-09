package com.mca.infrastructure.videogame.controllers;

import com.mca.domain.exceptions.NotFoundException;
import com.mca.domain.videogame.usecases.SearchVideoGamesUseCase;
import com.mca.domain.videogame.VideoGame;
import com.mca.domain.videogame.VideoGamePrimitives;
import java.util.List;
import org.openapitools.api.GameSagasApi;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.VideoGameSagaResponseInner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoGameController implements GameSagasApi {

    private final SearchVideoGamesUseCase searchVideoGamesUseCase;
    private final VideoGameDtoMapper videoGameDtoMapper;

    public VideoGameController(final SearchVideoGamesUseCase searchVideoGames, VideoGameDtoMapper videoGameDtoMapper) {
        this.searchVideoGamesUseCase = searchVideoGames;
        this.videoGameDtoMapper = videoGameDtoMapper;
    }


    @Override
    public ResponseEntity<List<VideoGameSagaResponseInner>> getGameSagaRelatedSagas(Integer sagaId) {
        final var query = SearchVideoGameQueryFactory.create(sagaId);
        List<VideoGame> videoGames = searchVideoGamesUseCase.handle(query);

        List<VideoGamePrimitives> videoGamePrimitivesCollection = videoGames.stream()
            .map(VideoGame::toPrimitives)
            .toList();
        return ResponseEntity.ok(this.videoGameDtoMapper.fromDomain(videoGamePrimitivesCollection));

    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(NotFoundException ex) {
        return new ResponseEntity<>(new ErrorResponse().message(ex.getMessage()).status(HttpStatus.NOT_FOUND.value()), HttpStatus.NOT_FOUND);
    }

}
