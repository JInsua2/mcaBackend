package com.mca.domain;

import java.util.List;


public interface RetrieveVideoGameSagaUseCase {
    List<VideoGame> handle(final RetrieveVideoGameSagaQuery retrieveVideoGameSagaQuery);
}
