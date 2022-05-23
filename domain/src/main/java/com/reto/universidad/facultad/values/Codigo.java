package com.reto.universidad.facultad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Codigo implements ValueObject<String> {

    private final String value;

    public Codigo(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("El codigo no debe estar vacío");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
