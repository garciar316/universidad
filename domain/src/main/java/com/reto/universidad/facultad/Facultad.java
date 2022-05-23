package com.reto.universidad.facultad;

import co.com.sofka.domain.generic.AggregateEvent;
import com.reto.universidad.facultad.entity.Decano;
import com.reto.universidad.facultad.events.DecanoCreado;
import com.reto.universidad.facultad.events.FacultadCreada;
import com.reto.universidad.facultad.values.*;
import com.reto.universidad.facultad.values.id.DecanoId;
import com.reto.universidad.facultad.values.id.FacultadId;

public class Facultad extends AggregateEvent<FacultadId> {

    protected Nombre nombre;
    protected Mision mision;
    protected Vision vision;
    protected Decano decano;

    public Facultad(FacultadId entityId, Nombre nombre, Mision mision, Vision vision) {
        super(entityId);
        appendChange(new FacultadCreada(nombre, mision, vision)).apply();
        subscribe(new FacultadEventChange(this));
    }

    public void agregarDecano(NombrePersona nombre) {
        var decanoId = new DecanoId();
        appendChange(new DecanoCreado(decanoId, nombre)).apply();
    }
}
