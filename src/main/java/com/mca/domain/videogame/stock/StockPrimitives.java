package com.mca.domain.videogame.stock;

import java.time.LocalDateTime;
import java.util.Objects;

public class StockPrimitives {
    private final Long id;
    private final Boolean availability;
    private final LocalDateTime time;

    public StockPrimitives(Long id, Boolean availability, LocalDateTime time) {
        this.id = id;
        this.availability = availability;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StockPrimitives that)) {
            return false;
        }

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
