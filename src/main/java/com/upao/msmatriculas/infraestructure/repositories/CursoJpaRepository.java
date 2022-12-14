package com.upao.msmatriculas.infraestructure.repositories;

import com.upao.msmatriculas.domain.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoJpaRepository extends JpaRepository<Curso,Long> {
}
