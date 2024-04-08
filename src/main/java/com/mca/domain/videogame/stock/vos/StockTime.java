package com.mca.domain.videogame.stock.vos;

import com.mca.domain.shared.ValueObject;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class StockTime extends ValueObject<LocalDateTime> {

    public StockTime(LocalDateTime value) {
        super(value);
    }
}
