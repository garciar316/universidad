package com.reto.universidad.programa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Modalidad implements ValueObject<String> {

    private final String value;

    public Modalidad(String value) {
        this.value = Objects.requireNonNull(value);

        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La modalidad no debe estar vacía");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
