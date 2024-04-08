package com.mca.domain.videogame.stock.vos;

import com.mca.domain.shared.ValueObject;

public class StockId extends ValueObject<Long> {

    public StockId(Long value) {
        super(value);
    }
}
