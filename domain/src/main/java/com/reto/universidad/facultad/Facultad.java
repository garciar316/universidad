package com.reto.universidad.facultad;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.reto.universidad.facultad.entity.Decano;
import com.reto.universidad.facultad.events.DecanoCreado;
import com.reto.universidad.facultad.events.FacultadCreada;
import com.reto.universidad.facultad.values.*;
import com.reto.universidad.facultad.values.id.DecanoId;
import com.reto.universidad.facultad.values.id.FacultadId;
import com.reto.universidad.programa.values.id.ProgramaId;

import java.util.List;
import java.util.Set;

public class Facultad extends AggregateEvent<FacultadId> {

    protected Nombre nombre;
    protected Mision mision;
    protected Vision vision;
    protected Decano decano;
    protected Set<ProgramaId> programas;

    public Facultad(FacultadId entityId, Nombre nombre, Mision mision, Vision vision) {
        super(entityId);
        appendChange(new FacultadCreada(nombre, mision, vision)).apply();
        subscribe(new FacultadEventChange(this));
    }

    private Facultad(FacultadId facultadId) {
        super(facultadId);
        subscribe(new FacultadEventChange(this));
    }

    public static Facultad from(FacultadId entityId, List<DomainEvent> events) {
        var facultad = new Facultad(entityId);
        events.forEach(facultad::applyEvent);
        return facultad;
    }

    public void agregarDecano(String id, NombrePersona nombre) {
        var decanoId = new DecanoId(id);
        appendChange(new DecanoCreado(decanoId, nombre)).apply();
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Mision Mision() {
        return mision;
    }

    public Vision Vision() {
        return vision;
    }

    public Decano Decano() {
        return decano;
    }

    public Set<ProgramaId> Programas() {
        return programas;
    }
}
