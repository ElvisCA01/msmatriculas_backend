package com.upao.msmatriculas.domain.services;

import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.entities.MensajeUpdatePayload;

import java.util.List;
import java.util.Optional;

public interface MensajeService {
    boolean Registrar(Mensaje mensaje);
    List<Mensaje> ListarTodos();

    Optional<Mensaje> Eliminar(String remitente);

    Optional<Mensaje> ConseguirMensajePorRemitente(String remitente);

    Optional<Mensaje> ActualizarMensaje(String remitente, MensajeUpdatePayload mensajeUpdatePayload);


}
