package com.mca.domain.vos;

import com.mca.domain.shared.ValueObject;

public class VideoGamePrice extends ValueObject<Float> {

    protected VideoGamePrice(final float value) {
        super(value);
    }
}
