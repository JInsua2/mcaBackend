package com.mca.domain.videogame.stock;

import com.mca.domain.shared.Entity;
import com.mca.domain.videogame.stock.vos.StockAvailability;
import com.mca.domain.videogame.stock.vos.StockId;
import com.mca.domain.videogame.stock.vos.StockTime;

public class Stock extends Entity<StockId> {

    private final StockAvailability availability;
    private final StockTime time;

    public Stock(
        final StockId id,
        final StockAvailability availability,
        final StockTime time) {

        super(id);
        this.availability = availability;
        this.time = time;
        this.ensureAttributeIsNotNull(availability);
        this.ensureAttributeIsNotNull(time);
    }

    public StockPrimitives toPrimitives() {
        return new StockPrimitives(
            this.id.getValue(),
            this.availability.getValue(),
            this.time.getValue()
        );
    }
}
