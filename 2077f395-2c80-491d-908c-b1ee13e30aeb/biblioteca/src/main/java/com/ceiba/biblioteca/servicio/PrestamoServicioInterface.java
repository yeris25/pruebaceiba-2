package com.ceiba.biblioteca.servicio;

import com.ceiba.biblioteca.entidad.Prestamo;

import java.time.LocalDate;

public interface PrestamoServicioInterface <E> {

    E crearPrestamo(Prestamo prestamo) throws Exception;

    LocalDate calcularFechaMaximaDevolucion(E prestamo);


    public E buscarporId(Integer id) throws Exception;
}
