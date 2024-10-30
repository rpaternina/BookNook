package com.libros.catalogo_Services.controller;


import com.libros.catalogo_Services.entity.Libro;
import com.libros.catalogo_Services.service.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/private/libros")
@AllArgsConstructor
public class LibroControllerPrivate {

    @Autowired
    private final LibroService libroService;

    /**
     * Agregar libros
     * @param libro
     * @return
     */

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasAuthority('admin')")
    public Libro addLibros(@RequestBody Libro libro){
        return libroService.addLibro(libro);
    }
}
