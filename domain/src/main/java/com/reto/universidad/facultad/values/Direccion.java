package com.reto.universidad.facultad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<Direccion.Props> {

    private final String departamento;
    private final String ciudad;
    private final String nomenclatura;

    public Direccion(String departamento, String ciudad, String nomenclatura) {
        this.departamento = Objects.requireNonNull(departamento);
        this.ciudad = Objects.requireNonNull(ciudad);
        this.nomenclatura = Objects.requireNonNull(nomenclatura);

        if (this.departamento.isBlank()) {
            throw new IllegalArgumentException("El departamento no debe estar vacío");
        }

        if (this.ciudad.isBlank()) {
            throw new IllegalArgumentException("La ciudad no debe estar vacía");
        }

        if (this.nomenclatura.isBlank()) {
            throw new IllegalArgumentException("la dirección no debe estar vacía");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String departamento() {
                return departamento;
            }

            @Override
            public String ciudad() {
                return ciudad;
            }

            @Override
            public String nomenclatura() {
                return nomenclatura;
            }
        };
    }

    public interface Props {
        String departamento();
        String ciudad();
        String nomenclatura();
    }
}
