package com.upao.msmatriculas.application.controllers;

import com.upao.msmatriculas.domain.dto.DetalleAlumnoCurso;
import com.upao.msmatriculas.domain.entities.Alumno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(path = "/alumno")
public interface AlumnoController {

    @GetMapping(produces = "application/json")
    List<Alumno> ListarAlumnos();

    @GetMapping(path="/detalle",produces = "application/json")
    List<DetalleAlumnoCurso> ListarDetalleAlumnos();


}
