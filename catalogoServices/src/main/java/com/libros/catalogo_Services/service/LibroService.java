package com.libros.catalogo_Services.service;


import com.libros.catalogo_Services.entity.Libro;
import com.libros.catalogo_Services.repository.LibroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return libroRepository.findByGeneroIgnoreCase(genero);
    }

    public List<Libro> getByNombreAutor(String autor){
        return libroRepository.findByAutorIgnoreCase(autor);
    }

    

}
