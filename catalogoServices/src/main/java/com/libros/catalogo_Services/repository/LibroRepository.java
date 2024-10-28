package com.libros.catalogo_Services.repository;

import com.libros.catalogo_Services.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface LibroRepository extends JpaRepository<Libro, Long> {

    //Devuelvo dentro de la lista de libros los que tengan el mismo nombre
    Optional<Libro> findByGeneroIgnoreCase(String genero);
    Optional<Libro> findByAutorIgnoreCase(String autor);
    Libro findByNombre(String nombre);

}
