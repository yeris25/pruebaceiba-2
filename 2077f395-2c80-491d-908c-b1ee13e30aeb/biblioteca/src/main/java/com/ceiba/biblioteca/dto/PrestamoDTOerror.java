package com.ceiba.biblioteca.dto;

public class PrestamoDTOerror extends PrestamoDTO{

   private String MensajeError;

    public PrestamoDTOerror(String mensajeError) {
        MensajeError = mensajeError;
    }
}
