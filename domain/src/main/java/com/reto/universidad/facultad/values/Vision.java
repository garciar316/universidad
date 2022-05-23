package com.reto.universidad.facultad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Vision implements ValueObject<String> {

    private final String value;

    public Vision(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La visión no debe estar vacía");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
