package com.reto.universidad.programa;

import co.com.sofka.domain.generic.EventChange;
import com.reto.universidad.programa.entity.JefeDePrograma;
import com.reto.universidad.programa.events.JefeDeProgramaCreado;
import com.reto.universidad.programa.events.ProgramaCreado;

public class ProgramaEventChange extends EventChange {

    public ProgramaEventChange(Programa programa) {
        apply((ProgramaCreado event) -> {
            programa.nombre = event.getNombre();
            programa.acreditacion = event.getAcreditacion();
            programa.duracion = event.getDuracion();
            programa.modalidad = event.getModalidad();
        });

        apply((JefeDeProgramaCreado event) -> programa.jefeDePrograma = new JefeDePrograma(
                event.getJefeDeProgramaId(), event.getNombre()));
    }
}
