package com.reto.universidad.facultad.commands;

import co.com.sofka.domain.generic.Command;
import com.reto.universidad.facultad.values.Mision;
import com.reto.universidad.facultad.values.Nombre;
import com.reto.universidad.facultad.values.Vision;
import com.reto.universidad.facultad.values.id.FacultadId;

public class CrearFacultad extends Command {

    private final FacultadId facultadId;
    private final Nombre nombre;
    private final Mision mision;
    private final Vision vision;

    public CrearFacultad(FacultadId facultadId, Nombre nombre, Mision mision, Vision vision) {
        this.facultadId = facultadId;
        this.nombre = nombre;
        this.mision = mision;
        this.vision = vision;
    }

    public FacultadId getFacultadId() {
        return facultadId;
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
