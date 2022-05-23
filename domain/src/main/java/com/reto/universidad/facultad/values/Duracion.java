package com.reto.universidad.facultad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Duracion implements ValueObject<Integer> {

    private final Integer value;

    public Duracion(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 0) {
            throw new IllegalArgumentException("La duración debe ser un numero positivo mayor que cero");
        }
    }

    @Override
    public Integer value() {
        return value;
    }
}
