package com.libros.catalogo_Services.service;


import com.libros.catalogo_Services.entity.Libro;
import com.libros.catalogo_Services.repository.LibroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LibroService {

    @Autowired
    private final LibroRepository libroRepository;

    // Metodo para guardar libros
    public Libro addLibro(Libro libro){
        return libroRepository.save(libro);
    }

    //Metodo para mostrar todos los libros
    public List<Libro> getAllLibros(){
        return libroRepository.findAll();
    }

    //Devuelvo una lista de generos de los libros
    public List<Libro> getByGenero(String genero){
        return libroRepository.findByGeneroIgnoreCase(genero.trim());
    }

    public Optional<Libro> getByNombreAutor(String autor){
        return libroRepository.findByAutorIgnoreCase(autor.trim());
    }

    public Libro getByNombre(String nombre){
        return libroRepository.findByNombre(nombre.trim());
    }

    // Actualizar libro
    public Libro actualizarLibro(Long id, Libro libroDetalles) {
        Libro libro = libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado"));

        libro.setGenero(libroDetalles.getGenero());
        return libroRepository.save(libro); // Guarda los cambios.
    }

    // Eliminar
    public void eliminarLibro(Long id) {
        libroRepository.deleteById(id); // Elimina el libro por ID.
    }

}
