package com.banco.sucursal.controller.dto;

import lombok.Data;

@Data
public class RespuestaDTO {
    String respuesta;

    public RespuestaDTO(String respuesta) {
        this.respuesta = respuesta;
    }
}