package com.upao.msmatriculas.infraestructure.repositories;

import com.upao.msmatriculas.domain.entities.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeNosqlRepository extends MongoRepository<Mensaje,String> {
}
