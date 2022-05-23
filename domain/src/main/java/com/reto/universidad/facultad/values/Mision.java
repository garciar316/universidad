package com.reto.universidad.facultad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Mision implements ValueObject<String> {

    private final String value;

    public Mision(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La misión no debe estar vacía");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
