package com.mca.domain.videogame.vos;

import com.mca.domain.shared.ValueObject;
import java.time.LocalDateTime;
import java.util.Objects;

public class PriceDateTime extends ValueObject<LocalDateTime> {

    public PriceDateTime(final LocalDateTime value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PriceDateTime)) return false;
        PriceDateTime that = (PriceDateTime) o;
        LocalDateTime truncatedThisValue = this.getValue().withSecond(0).withNano(0);
        LocalDateTime truncatedThatValue = that.getValue().withSecond(0).withNano(0);
        return Objects.equals(truncatedThisValue, truncatedThatValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getValue().withSecond(0).withNano(0));
    }
}
