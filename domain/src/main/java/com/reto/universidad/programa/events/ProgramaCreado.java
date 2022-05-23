package com.reto.universidad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.reto.universidad.programa.values.Acreditacion;
import com.reto.universidad.programa.values.Duracion;
import com.reto.universidad.programa.values.Modalidad;
import com.reto.universidad.programa.values.Nombre;

public class ProgramaCreado extends DomainEvent {
    private final Nombre nombre;
    private final Acreditacion acreditacion;
    private final Modalidad modalidad;
    private final Duracion duracion;

    public ProgramaCreado(Nombre nombre, Acreditacion acreditacion, Modalidad modalidad, Duracion duracion) {
        super("com.reto.universidad.programa.ProgramaCreado");
        this.nombre = nombre;
        this.acreditacion = acreditacion;
        this.modalidad = modalidad;
        this.duracion = duracion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Acreditacion getAcreditacion() {
        return acreditacion;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
