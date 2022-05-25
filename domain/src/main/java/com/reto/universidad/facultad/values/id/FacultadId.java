package com.reto.universidad.facultad.values.id;

import co.com.sofka.domain.generic.Identity;
import com.reto.universidad.facultad.Facultad;

public class FacultadId extends Identity {
    public FacultadId(String id) {
        super(id);
    }

    public static FacultadId of(String id) {
        return new FacultadId(id);
    }
}
