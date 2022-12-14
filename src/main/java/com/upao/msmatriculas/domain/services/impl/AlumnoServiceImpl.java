package com.upao.msmatriculas.domain.services.impl;

import com.upao.msmatriculas.domain.dto.DetalleAlumnoCurso;
import com.upao.msmatriculas.domain.entities.Alumno;
import com.upao.msmatriculas.domain.services.AlumnoService;
import com.upao.msmatriculas.infraestructure.repositories.impljpa.AlumnoJpaRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    AlumnoJpaRepositoryImpl alumnoJpaRepository;

    @Override
    public List<Alumno> ListarAlumnos() {
        return alumnoJpaRepository.Listar();
    }

    @Override
    public List<DetalleAlumnoCurso> ListarDetalleAlumnos() {
        return alumnoJpaRepository.ListarAlumnoCursos();
    }
}
