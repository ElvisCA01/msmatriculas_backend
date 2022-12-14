package com.upao.msmatriculas.domain.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "cursos")
@Entity
@Getter
@Setter
@ToString
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Nonnull
    String titulo;
    @Nonnull
    String duracion;

    @ManyToOne
    @JoinColumn(name = "alumno_dni")
    private Alumno alumno;
}
