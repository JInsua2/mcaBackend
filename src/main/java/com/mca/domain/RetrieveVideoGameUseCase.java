package com.mca.domain;

public interface RetrieveVideoGameUseCase {
    VideoGame handle(final RetrieveVideoGamaQuery retrieveVideoGamaQuery);
}
