package com.mca.domain.vos;

import com.mca.domain.shared.ValueObject;
import java.time.LocalDateTime;


public class PriceDateTime extends ValueObject<LocalDateTime> {
    public PriceDateTime(final LocalDateTime value) {
        super(value);
    }
}
