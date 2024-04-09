package com.mca.domain.videogame.usecases;

import com.mca.domain.videogame.commands.UpdateStockCommand;

public interface UpdateStockUseCase {

    void handle(UpdateStockCommand updateStockCommand);
}
