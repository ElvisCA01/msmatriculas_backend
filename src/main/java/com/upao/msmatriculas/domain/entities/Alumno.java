package com.upao.msmatriculas.domain.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Table(name = "alumnos")
@Entity
@Getter
@Setter
@ToString
public class Alumno {

    @Id
    String dni;
    @Nonnull
    String nombre;
    @Nonnull
    String apellidos;
    @Nonnull
    int edad;

    @OneToMany(mappedBy = "alumno")
    List<Curso> cursos=new ArrayList<Curso>();
}
