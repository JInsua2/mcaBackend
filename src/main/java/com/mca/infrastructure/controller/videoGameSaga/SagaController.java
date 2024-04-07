package com.mca.infrastructure.controller.videoGameSaga;

import com.mca.domain.RetrieveVideoGameSagaUseCase;
import com.mca.domain.VideoGame;
import com.mca.domain.VideoGamePrimitives;
import java.util.List;
import java.util.stream.Collectors;
import org.openapitools.api.GameSagasApi;
import org.openapitools.model.VideoGameResponse;
import org.openapitools.model.VideoGameSagaResponseInner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SagaController implements GameSagasApi {

    private final RetrieveVideoGameSagaUseCase retrieveVideoGameSagaUseCase;
    private final VideoGameResponseMapper videoGameResponseMapper;

    public SagaController(RetrieveVideoGameSagaUseCase retrieveVideoGameSagaUseCase, VideoGameResponseMapper videoGameResponseMapper) {
        this.retrieveVideoGameSagaUseCase = retrieveVideoGameSagaUseCase;
        this.videoGameResponseMapper = videoGameResponseMapper;
    }

    @Override
    public ResponseEntity<List<VideoGameSagaResponseInner>> getGameSagaRelatedSagas(Integer sagaId) {
        //TODO create response with array object to avoid returning a List of Inners
        final var query = RetrieveVideoGameQueryFactory.create(sagaId);
        List<VideoGame> videoGames = retrieveVideoGameSagaUseCase.handle(query);

        List<VideoGamePrimitives> videoGamePrimitivesCollection = videoGames.stream()
            .map(VideoGame::toPrimitives)
            .collect(Collectors.toList());
        return ResponseEntity.ok(this.videoGameResponseMapper.fromDomain(videoGamePrimitivesCollection));

    }

}
