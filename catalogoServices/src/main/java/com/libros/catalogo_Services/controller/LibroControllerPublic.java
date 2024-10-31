package com.libros.catalogo_Services.controller;


import com.libros.catalogo_Services.entity.Libro;
import com.libros.catalogo_Services.service.LibroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/public/libros")
public class LibroControllerPublic {

    @Autowired
    private final LibroService libroService;

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
    public Optional<Libro> getByNombreAutor(@PathVariable String autor){
        return libroService.getByNombreAutor(autor);
    }
    
    @GetMapping("/nombre/{nombre}")
    @ResponseStatus(HttpStatus.OK)
    public Libro getByNombre(@PathVariable String nombre){
        return libroService.getByNombre(nombre);
    }

    // Endpoint para actualizar un libro específico
    @PutMapping("/{id}")
    public Libro actualizarLibro(@PathVariable Long id, @RequestBody Libro libroDetalles) {
        return libroService.actualizarLibro(id, libroDetalles); // Actualiza y retorna el libro.
    }

    // Endpoint para eliminar un libro
    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroService.eliminarLibro(id); // Llama al servicio para eliminar el libro.
    }

}
