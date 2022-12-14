package com.upao.msmatriculas.infraestructure.repositories;

import com.upao.msmatriculas.domain.dto.DetalleAlumnoCurso;
import com.upao.msmatriculas.domain.entities.Alumno;
import com.upao.msmatriculas.domain.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoJpaRepository extends JpaRepository<Alumno,String> {

    @Query(value = "select c from Alumno a inner join Curso c on a.dni=c.alumno.dni" )
    List<Curso> ListarAlumnoCursos();
}
