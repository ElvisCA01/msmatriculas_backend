package com.upao.msmatriculas.domain.repositories;

import com.upao.msmatriculas.domain.dto.DetalleAlumnoCurso;
import com.upao.msmatriculas.domain.entities.Alumno;

import java.util.List;

public interface AlumnoRepository {
    List<Alumno> Listar();
    List<DetalleAlumnoCurso> ListarAlumnoCursos();
}
