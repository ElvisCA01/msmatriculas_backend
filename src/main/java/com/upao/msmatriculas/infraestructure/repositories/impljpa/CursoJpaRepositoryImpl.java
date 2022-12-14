package com.upao.msmatriculas.infraestructure.repositories.impljpa;

import com.upao.msmatriculas.domain.entities.Curso;
import com.upao.msmatriculas.domain.repositories.CursoRepository;
import com.upao.msmatriculas.infraestructure.repositories.CursoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CursoJpaRepositoryImpl implements CursoRepository {
    @Autowired
    CursoJpaRepository cursoJpaRepository;

    @Override
    public List<Curso> Listar() {
        return cursoJpaRepository.findAll();
    }
}
