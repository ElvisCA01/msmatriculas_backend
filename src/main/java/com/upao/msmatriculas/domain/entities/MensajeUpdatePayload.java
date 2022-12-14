package com.upao.msmatriculas.domain.entities;

public class MensajeUpdatePayload {

    public String getDestinatario() {
        return destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    private String destinatario;
    private String asunto;
    private String fecha;
    private String contenido;
}
