package com.mca.domain.vos;

import com.mca.domain.shared.ValueObject;

public class VideoGameStock extends ValueObject<Integer> {

    protected VideoGameStock(final int value) {
        super(value);
    }
}
