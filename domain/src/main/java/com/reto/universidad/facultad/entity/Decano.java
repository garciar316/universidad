package com.reto.universidad.facultad.entity;

import co.com.sofka.domain.generic.Entity;
import com.reto.universidad.facultad.values.id.DecanoId;
import com.reto.universidad.facultad.values.NombrePersona;

public class Decano extends Entity<DecanoId> {

    protected NombrePersona nombre;
    public Decano(DecanoId entityId, NombrePersona nombre) {
        super(entityId);
        this.nombre = nombre;
    }
}
