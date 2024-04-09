package com.mca.domain.videogame.vos;

import com.mca.domain.shared.ValueObject;
import java.util.Objects;

public class VideoGameSagaId extends ValueObject<Long> {

    public VideoGameSagaId(final Long value) {
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoGameSagaId that)) return false;
        return Objects.equals(this.getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getValue());
    }
}
