package com.mca.domain.videogame.vos;

import com.mca.domain.shared.ValueObject;

public class VideoGameId extends ValueObject<Long> {

    public VideoGameId(final Long value) {
        super(value);
    }
}
