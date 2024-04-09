package com.mca.infrastructure.videogame.listeners;

import com.mca.domain.videogame.commands.UpdateStockCommand;
import com.mca.domain.videogame.stock.vos.StockAvailability;
import com.mca.domain.videogame.stock.vos.StockId;
import com.mca.domain.videogame.stock.vos.StockTime;
import com.mca.infrastructure.videogame.integrationevents.UpdateStockEvent;

public class UpdateStockCommandFactory {

    public UpdateStockCommandFactory(){
    }

    public static UpdateStockCommand create(final UpdateStockEvent videoGameEvent) {
        StockId stockId = new StockId(videoGameEvent.getStock_id());
        StockAvailability availability = new StockAvailability(videoGameEvent.isAvailability());
        StockTime stockTime = new StockTime(videoGameEvent.getTime_update().toLocalDateTime());

        return new UpdateStockCommand(stockId, availability, stockTime);
    }
}
