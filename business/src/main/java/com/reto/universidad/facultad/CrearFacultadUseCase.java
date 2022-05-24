package com.reto.universidad.facultad;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.reto.universidad.facultad.commands.CrearFacultad;

public class CrearFacultadUseCase extends UseCase<RequestCommand<CrearFacultad>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearFacultad> crearFacultadRequestCommand) {
        var command = crearFacultadRequestCommand.getCommand();
        var facultad = new Facultad(
                command.getFacultadId(), command.getNombre(), command.getMision(), command.getVision());
        emit().onResponse(new ResponseEvents(facultad.getUncommittedChanges()));
    }
}
