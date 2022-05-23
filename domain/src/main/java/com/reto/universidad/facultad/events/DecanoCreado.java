package com.reto.universidad.facultad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.reto.universidad.facultad.values.id.DecanoId;
import com.reto.universidad.facultad.values.NombrePersona;

public class DecanoCreado extends DomainEvent {

    private final DecanoId decanoId;
    private final NombrePersona nombre;

    public DecanoCreado(DecanoId decanoId, NombrePersona nombre) {
        super("com.reto.universidad.DecanoCreado");

        this.decanoId = decanoId;
        this.nombre = nombre;
    }

    public DecanoId getDecanoId() {
        return decanoId;
    }

    public NombrePersona getNombre() {
        return nombre;
    }
}
