package com.mca.domain.vos;

import com.mca.domain.shared.ValueObject;
import java.util.Objects;

public class VideoGameSagaId extends ValueObject<Integer> {

    public VideoGameSagaId(final int value) {
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
