package com.upao.msmatriculas.application.controllers.impl;

import com.upao.msmatriculas.application.controllers.AlumnoController;
import com.upao.msmatriculas.domain.dto.DetalleAlumnoCurso;
import com.upao.msmatriculas.domain.entities.Alumno;
import com.upao.msmatriculas.domain.services.impl.AlumnoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlumnoControllerImpl implements AlumnoController {
    @Autowired
    AlumnoServiceImpl alumnoService;

    @Override
    public List<Alumno> ListarAlumnos() {
        return alumnoService.ListarAlumnos();
    }

    @Override
    public List<DetalleAlumnoCurso> ListarDetalleAlumnos() {
        return alumnoService.ListarDetalleAlumnos();
    }
}
