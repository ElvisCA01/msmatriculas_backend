package com.upao.msmatriculas.domain.repositories;

import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.entities.MensajeUpdatePayload;

import java.util.List;
import java.util.Optional;

public interface MensajeRepository {


    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();

    Optional<Mensaje> ActualizarMensaje(String remitente, MensajeUpdatePayload mensajeUpdatePayload);

    Optional<Mensaje> Eliminar(String remitente);

    Optional<Mensaje> ConseguirMensajePorRemitente(String remitente);
}
