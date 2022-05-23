package com.reto.universidad.facultad.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.reto.universidad.facultad.values.Mision;
import com.reto.universidad.facultad.values.Nombre;
import com.reto.universidad.facultad.values.Vision;

public class FacultadCreada extends DomainEvent {

    private final Nombre nombre;
    private final Mision mision;
    private final Vision vision;

    public FacultadCreada(Nombre nombre, Mision mision, Vision vision) {
        super("com.reto.universidad.FacultadCreada");

        this.nombre = nombre;
        this.mision = mision;
        this.vision = vision;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Mision getMision() {
        return mision;
    }

    public Vision getVision() {
        return vision;
    }
}
