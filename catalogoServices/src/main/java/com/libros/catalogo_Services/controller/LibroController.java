package com.libros.catalogo_Services.controller;


import com.libros.catalogo_Services.entity.Libro;
import com.libros.catalogo_Services.service.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/libros")
public class LibroController {

    @Autowired
    private final LibroService libroService;

    /**
     * Agregar libros
     * @param libro
     * @return
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Libro addLibros(@RequestBody Libro libro){
        return libroService.addLibro(libro);
    }

    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getAllLibros(){
        return libroService.getAllLibros();
    }

    @GetMapping("/{genero}")
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getLibroByname(@PathVariable String genero){
        return libroService.getByGenero(genero);
    }

}
