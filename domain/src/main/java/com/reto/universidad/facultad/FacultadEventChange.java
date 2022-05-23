package com.reto.universidad.facultad;

import co.com.sofka.domain.generic.EventChange;
import com.reto.universidad.facultad.entity.Decano;
import com.reto.universidad.facultad.events.DecanoCreado;
import com.reto.universidad.facultad.events.FacultadCreada;

import java.util.HashSet;

public class FacultadEventChange extends EventChange {

    public FacultadEventChange(Facultad facultad) {
        apply((FacultadCreada event) -> {
           facultad.nombre = event.getNombre();
           facultad.mision = event.getMision();
           facultad.vision = event.getVision();
           facultad.programas = new HashSet<>();
        });

        apply((DecanoCreado event) -> facultad.decano = new Decano(event.getDecanoId(), event.getNombre()));
    }
}
