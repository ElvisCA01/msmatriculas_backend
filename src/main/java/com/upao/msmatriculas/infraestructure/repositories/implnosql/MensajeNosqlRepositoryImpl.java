package com.upao.msmatriculas.infraestructure.repositories.implnosql;

import com.upao.msmatriculas.domain.entities.Mensaje;
import com.upao.msmatriculas.domain.entities.MensajeUpdatePayload;
import com.upao.msmatriculas.domain.repositories.MensajeRepository;
import com.upao.msmatriculas.infraestructure.repositories.MensajeNosqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component

public class MensajeNosqlRepositoryImpl implements MensajeRepository {

    @Autowired
    MensajeNosqlRepository mensajeNosqlRepository;

    @Override
    public boolean Registrar(Mensaje mensaje) {
        mensajeNosqlRepository.save(mensaje);
        return true;
    }

    @Override
    public List<Mensaje> ListarTodos() {
        return mensajeNosqlRepository.findAll();
    }





    @Override
    public Optional<Mensaje> Eliminar(String remitente){
        Optional<Mensaje> mensaje = mensajeNosqlRepository.findById(remitente);
        mensaje.ifPresent(b-> mensajeNosqlRepository.delete(b));
        return mensaje;
    }

    @Override
    public Optional<Mensaje> ConseguirMensajePorRemitente(String remitente){
       return mensajeNosqlRepository.findById(remitente);

    }


    public Optional<Mensaje> ActualizarMensaje(String remitente, MensajeUpdatePayload mensajeUpdatePayload) {
        Optional<Mensaje> mensaje = mensajeNosqlRepository.findById(remitente);
        mensaje.ifPresent(b -> b.setAsunto(mensajeUpdatePayload.getAsunto()));
        mensaje.ifPresent(b ->b.setFecha(mensajeUpdatePayload.getFecha()));
        mensaje.ifPresent(b ->b.setContenido(mensajeUpdatePayload.getContenido()));
        mensaje.ifPresent(b ->b.setDestinatario(mensajeUpdatePayload.getDestinatario()));
        mensaje.ifPresent(b -> mensajeNosqlRepository.save(b));
        return mensaje;
    }
}
