package com.reto.universidad.facultad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombrePersona implements ValueObject<NombrePersona.Props> {

    private final String nombre;
    private final String apellido;

    public NombrePersona(String nombre, String apellido) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);

        if (this.nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no debe estar vacío");
        }
        if (this.apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido no debe estar vacío");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Props {
        String nombre();
        String apellido();
    }
}
