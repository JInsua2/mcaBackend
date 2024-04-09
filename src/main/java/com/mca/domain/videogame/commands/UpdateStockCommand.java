package com.mca.domain.videogame.commands;

import com.mca.domain.videogame.stock.vos.StockAvailability;
import com.mca.domain.videogame.stock.vos.StockId;
import com.mca.domain.videogame.stock.vos.StockTime;
import java.sql.Timestamp;

public record UpdateStockCommand(
    StockId stockId,
    StockAvailability availability,
    StockTime lasUpdated
) {

}
