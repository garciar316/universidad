package com.reto.universidad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.reto.universidad.programa.values.id.JefeDeProgramaId;
import com.reto.universidad.programa.values.NombrePersona;

public class JefeDeProgramaCreado extends DomainEvent {

    private final JefeDeProgramaId jefeDeProgramaId;
    private final NombrePersona nombre;

    public JefeDeProgramaCreado(JefeDeProgramaId jefeDeProgramaId, NombrePersona nombre) {
        super("com.reto.universidad.programa.JefeDeProgramaCreado");

        this.jefeDeProgramaId = jefeDeProgramaId;
        this.nombre = nombre;
    }

    public JefeDeProgramaId getJefeDeProgramaId() {
        return jefeDeProgramaId;
    }

    public NombrePersona getNombre() {
        return nombre;
    }
}
