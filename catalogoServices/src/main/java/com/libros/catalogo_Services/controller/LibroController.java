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

    /**
     * Mostrar todos los libros
     * @return
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getAllLibros(){
        return libroService.getAllLibros();
    }

    /**
     * Mostrar libros por genero
     * @param genero
     * @return
     */
    @GetMapping("/genero/{genero}")
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getLibroByname(@PathVariable String genero){
        return libroService.getByGenero(genero);
    }

    /**
     * Mostrar libros por autor
     * @param autor
     * @return
     */
    @GetMapping("/autor/{autor}")
    @ResponseStatus(HttpStatus.OK)
    public List<Libro> getByNombreAutor(@PathVariable String autor){
        return libroService.getByNombreAutor(autor);
    }

    @GetMapping("/nombre/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    public Libro getByNombre(@PathVariable String nombre){
        return libroService.getByNombre(nombre);
    }

}
