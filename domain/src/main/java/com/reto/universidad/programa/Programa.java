package com.reto.universidad.programa;

import co.com.sofka.domain.generic.AggregateEvent;
import com.reto.universidad.programa.values.id.JefeDeProgramaId;
import com.reto.universidad.programa.entity.JefeDePrograma;
import com.reto.universidad.programa.events.JefeDeProgramaCreado;
import com.reto.universidad.programa.events.ProgramaCreado;
import com.reto.universidad.programa.values.*;
import com.reto.universidad.programa.values.id.ProgramaId;

public class Programa extends AggregateEvent<ProgramaId> {
    protected Nombre nombre;
    protected Acreditacion acreditacion;
    protected Duracion duracion;
    protected Modalidad modalidad;
    protected JefeDePrograma jefeDePrograma;

    public Programa(
            ProgramaId entityId, Nombre nombre, Acreditacion acreditacion, Modalidad modalidad, Duracion duracion) {
        super(entityId);
        appendChange(new ProgramaCreado(nombre, acreditacion, modalidad, duracion));
        subscribe(new ProgramaEventChange(this));
    }

    public void agregarJefeDePrograma(String id, NombrePersona nombre) {
        JefeDeProgramaId jefeDeProgramaId = new JefeDeProgramaId(id);
        appendChange(new JefeDeProgramaCreado(jefeDeProgramaId, nombre));
    }
}
