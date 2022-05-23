package com.reto.universidad.programa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Acreditacion implements ValueObject<Boolean> {

    private final Boolean value;

    public Acreditacion(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Boolean value() {
        return this.value;
    }
}
