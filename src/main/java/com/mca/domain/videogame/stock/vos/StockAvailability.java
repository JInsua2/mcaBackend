package com.mca.domain.videogame.stock.vos;

import com.mca.domain.shared.ValueObject;

public class StockAvailability extends ValueObject<Boolean> {

    public StockAvailability(Boolean value) {
        super(value);
    }
}
