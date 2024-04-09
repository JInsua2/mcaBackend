package com.mca.domain.shared;

import java.util.Objects;

public abstract class Entity<T extends ValueObject<?>> {

    private static final String ATTRIBUTE_CAN_NOT_BE_NULL = "Attribute can not be null";

    protected final T id;

    protected Entity(final T id) {
        this.id = id;
        this.ensureAttributeIsNotNull(id);
    }

    protected void ensureAttributeIsNotNull(final Object attribute) {
        if (attribute == null) {
            throw new IllegalArgumentException(ATTRIBUTE_CAN_NOT_BE_NULL);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregateRoot<?> that)) {
            return false;
        }

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
