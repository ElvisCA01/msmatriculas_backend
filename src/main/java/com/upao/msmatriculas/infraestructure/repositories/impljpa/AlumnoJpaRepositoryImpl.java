package com.upao.msmatriculas.infraestructure.repositories.impljpa;

import com.upao.msmatriculas.domain.dto.DetalleAlumnoCurso;
import com.upao.msmatriculas.domain.entities.Alumno;
import com.upao.msmatriculas.domain.entities.Curso;
import com.upao.msmatriculas.domain.repositories.AlumnoRepository;
import com.upao.msmatriculas.infraestructure.repositories.AlumnoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AlumnoJpaRepositoryImpl implements AlumnoRepository {
    @Autowired
    AlumnoJpaRepository alumnoJpaRepository;

    @Override
    public List<Alumno> Listar() {
        return alumnoJpaRepository.findAll();
    }

    @Override
    public List<DetalleAlumnoCurso> ListarAlumnoCursos() {

        List<DetalleAlumnoCurso> detalle=new ArrayList<DetalleAlumnoCurso>();
        DetalleAlumnoCurso detalleAlumnoCurso;
        List<Curso> lstCursos=alumnoJpaRepository.ListarAlumnoCursos();
        for( Curso c: lstCursos )
        {
            detalleAlumnoCurso=new DetalleAlumnoCurso();
            detalleAlumnoCurso.setDni(c.getAlumno().getDni());
            detalleAlumnoCurso.setApellidos(c.getAlumno().getApellidos());
            detalleAlumnoCurso.setNombre(c.getAlumno().getNombre());
            detalleAlumnoCurso.setEdad(c.getAlumno().getEdad());
            detalleAlumnoCurso.setTitulo(c.getTitulo());
            detalleAlumnoCurso.setDuracion(c.getDuracion());

            detalle.add(detalleAlumnoCurso);
        }
        return detalle;
    }
}
