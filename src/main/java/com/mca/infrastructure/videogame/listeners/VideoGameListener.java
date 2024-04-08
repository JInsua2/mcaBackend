package com.mca.infrastructure.videogame.listeners;

import com.google.gson.Gson;
import com.mca.infrastructure.videogame.integrationevents.UpdateStockEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;
@Controller
public class VideoGameListener {
	private Gson gson;

	public VideoGameListener() {
	    this.gson = new Gson();
	}

    @KafkaListener(topics = "${topic}")
    public void updateStock(final String event) {
        final var videoGameEvent = gson.fromJson(event, UpdateStockEvent.class);
        System.out.println("Me estoy haciendo un cafe, ya funciona :)");

    }
}
