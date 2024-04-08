package com.mca.domain.videogame.usecases;

import com.mca.infrastructure.videogame.integrationevents.UpdateStockEvent;

public interface UpdateStockUseCase {

    void handle(UpdateStockEvent videoGameEvent);
}
