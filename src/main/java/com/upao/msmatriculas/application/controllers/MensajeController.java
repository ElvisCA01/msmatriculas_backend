package com.upao.msmatriculas.application.controllers;

import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.entities.MensajeUpdatePayload;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/mensajes")
public interface MensajeController {

    @GetMapping(produces = "application/json")
    List<Mensaje> ListarTodos();

    @PostMapping(produces = "application/json", consumes = "application/json")
    boolean Registrar(@RequestBody Mensaje mensaje);

    @PutMapping(value="/{remitente}")
    Optional<Mensaje> ActualizarMensaje(@PathVariable("remitente") String remitente, @RequestBody MensajeUpdatePayload mensajeUpdatePayload);

    @DeleteMapping(produces = "application/json", value = "/{remitente}")
    Optional<Mensaje> Eliminar(@PathVariable("remitente") String remitente);

    @GetMapping(produces = "application/json", value = "/{remitente}")
    Optional<Mensaje> ConseguirMensajePorRemitente(@PathVariable("remitente") String remitente);
}
