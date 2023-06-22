package com.ceiba.biblioteca.controlador;


import com.ceiba.biblioteca.entidad.Prestamo;
import com.ceiba.biblioteca.servicio.PrestamoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("prestamo")
public class PrestamoControlador {
    @Autowired
    protected PrestamoServicio prestamoServicio;
    @PostMapping
    public ResponseEntity<Prestamo> crearPrestamo(@RequestBody Prestamo prestamo) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(prestamoServicio.crearPrestamo(prestamo));
        } catch (Exception e) {
            String mensajeDeError = "{\"mensaje\": \"" + e.getMessage() + "\"}";
            Prestamo errorPrestamo = new Prestamo();
            errorPrestamo.setMensajeError(mensajeDeError);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorPrestamo);
        }
    }

    @GetMapping("/{id})")
    public ResponseEntity<Prestamo>buscarporid(@PathVariable Integer id){
        try{
            Prestamo UsuarioServicio= prestamoServicio.buscarporId(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(UsuarioServicio);
        } catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        }
    }



}

