package com.reto.universidad.facultad;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.reto.universidad.facultad.commands.CrearFacultad;
import com.reto.universidad.facultad.events.FacultadCreada;
import com.reto.universidad.facultad.values.Mision;
import com.reto.universidad.facultad.values.Nombre;
import com.reto.universidad.facultad.values.Vision;
import com.reto.universidad.facultad.values.id.FacultadId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CrearFacultadUseCaseTest {

    private CrearFacultadUseCase useCase;

    @BeforeEach
    void setUp() {
       useCase = new CrearFacultadUseCase();
    }

    @Test
    void crearFacultadHappyPass() {
        //arrange
        FacultadId facultadId = FacultadId.of("111");
        Nombre nombre = new Nombre("Artes");
        Mision mision = new Mision("Graduar estudiantes");
        Vision vision = new Vision("Ser una excelente universidad");
        var command = new CrearFacultad(facultadId, nombre, mision, vision);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var facultadCreada = (FacultadCreada)events.get(0);
        Assertions.assertEquals("111", facultadCreada.aggregateRootId());
        Assertions.assertEquals("Artes", facultadCreada.getNombre().value());
        Assertions.assertEquals("Graduar estudiantes", facultadCreada.getMision().value());
        Assertions.assertEquals("Ser una excelente universidad", facultadCreada.getVision().value());
    }
}