package com.mca.domain.vos;

import com.mca.domain.shared.ValueObject;

public class VideoGamePrice extends ValueObject<Float> {

    public VideoGamePrice(final float value) {
        super(value);
    }
}
