package com.reto.universidad.programa.entity;

import co.com.sofka.domain.generic.Entity;
import com.reto.universidad.programa.values.id.JefeDeProgramaId;
import com.reto.universidad.programa.values.NombrePersona;

public class JefeDePrograma extends Entity<JefeDeProgramaId> {

    protected NombrePersona nombre;
    public JefeDePrograma(JefeDeProgramaId entityId, NombrePersona nombre) {
        super(entityId);
        this.nombre = nombre;
    }
}
