package com.mca.domain.vos;

import com.mca.domain.shared.ValueObject;

public class VideoGameId extends ValueObject<Integer> {

    public VideoGameId(final int value) {
        super(value);
    }
}
