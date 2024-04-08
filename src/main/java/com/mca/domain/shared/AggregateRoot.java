package com.mca.domain.shared;

import java.util.Objects;

public abstract class AggregateRoot<T extends ValueObject<?>> {

    private final T id;

    protected AggregateRoot(final T id) {
        this.id = id;
    }

    protected T getId() {
        return id;
    }
}
