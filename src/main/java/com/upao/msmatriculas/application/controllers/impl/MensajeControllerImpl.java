package com.upao.msmatriculas.application.controllers.impl;

import com.upao.msmatriculas.application.controllers.MensajeController;
import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.entities.MensajeUpdatePayload;
import com.upao.msmatriculas.domain.services.impl.MensajeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MensajeControllerImpl implements MensajeController {

    @Autowired
    MensajeServiceImpl mensajeService;

    @Override
    public List<Mensaje> ListarTodos() {
        return mensajeService.ListarTodos();
    }

    @Override
    public boolean Registrar(Mensaje mensaje) {
        return mensajeService.Registrar(mensaje);
    }

    @Override
    public Optional<Mensaje> ActualizarMensaje(String remitente, MensajeUpdatePayload mensajeUpdatePayload) {
        return mensajeService.ActualizarMensaje(remitente,mensajeUpdatePayload);
    }


    @Override
    public Optional<Mensaje> Eliminar(String remitente){
        return mensajeService.Eliminar(remitente);
    }
    @Override
    public Optional<Mensaje> ConseguirMensajePorRemitente(String remitente){
        return mensajeService.ConseguirMensajePorRemitente(remitente);
    }


}
