package com.mca.application.videogame;

import com.mca.domain.videogame.VideoGameRepository;
import com.mca.domain.videogame.commands.UpdateStockCommand;
import com.mca.domain.videogame.usecases.UpdateStockUseCase;
import org.springframework.stereotype.Service;

@Service
public class UpdateStockUseCaseHandle implements UpdateStockUseCase {

    private final VideoGameRepository videoGameRepository;

    public UpdateStockUseCaseHandle(VideoGameRepository videoGameRepository){
        this.videoGameRepository = videoGameRepository;
    }

    @Override
    public void handle(UpdateStockCommand updateStockCommand) {
        videoGameRepository.updateStock(
            updateStockCommand.stockId(),
            updateStockCommand.availability(),
            updateStockCommand.lasUpdated());
    }
}
