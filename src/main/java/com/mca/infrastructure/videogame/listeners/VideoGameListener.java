package com.mca.infrastructure.videogame.listeners;

import com.google.gson.Gson;
import com.mca.domain.videogame.usecases.UpdateStockUseCase;
import com.mca.infrastructure.videogame.integrationevents.UpdateStockEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
@Controller
public class VideoGameListener {
	private Gson gson;

    private UpdateStockUseCase updateStockUseCase;



    public VideoGameListener(UpdateStockUseCase updateStockUseCase){
        this.updateStockUseCase = updateStockUseCase;
        this.gson = new Gson();
    }

    @KafkaListener(topics = "${topic}")
    public void updateStock(final String event) {
        final var videoGameEvent = gson.fromJson(event, UpdateStockEvent.class);
        final var command = UpdateStockCommandFactory.create(videoGameEvent);
        updateStockUseCase.handle(command);

    }
}
