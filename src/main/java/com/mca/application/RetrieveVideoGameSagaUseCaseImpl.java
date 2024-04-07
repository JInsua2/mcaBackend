package com.mca.application;

import com.mca.domain.RetrieveVideoGameSagaQuery;
import com.mca.domain.RetrieveVideoGameSagaUseCase;
import com.mca.domain.VideoGame;
import com.mca.domain.VideoGameRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RetrieveVideoGameSagaUseCaseImpl implements RetrieveVideoGameSagaUseCase {

    private final VideoGameRepository videoGameRepository;

    @Override
    public List<VideoGame> handle(RetrieveVideoGameSagaQuery retrieveVideoGameSagaQuery) {
        return videoGameRepository.findActiveVideoGameSaga(
            retrieveVideoGameSagaQuery.videoGameSagaId(),
            retrieveVideoGameSagaQuery.priceDateTime());
    }
}
