package com.upao.msmatriculas.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DetalleAlumnoCurso {
    String dni;
    String apellidos;
    String nombre;
    int edad;
    String titulo;
    String duracion;
}
