package com.upao.msmatriculas.domain.services;

import com.upao.msmatriculas.domain.dto.DetalleAlumnoCurso;
import com.upao.msmatriculas.domain.entities.Alumno;

import java.util.List;

public interface AlumnoService {
    List<Alumno> ListarAlumnos();
    List<DetalleAlumnoCurso> ListarDetalleAlumnos();
}
