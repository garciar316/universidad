package com.reto.universidad.facultad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Semestre implements ValueObject<Integer> {

    private final Integer value;

    public Semestre(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return value;
    }
}
