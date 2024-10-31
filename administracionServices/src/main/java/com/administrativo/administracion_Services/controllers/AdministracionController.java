package com.administrativo.administracion_Services.controllers;


import com.administrativo.administracion_Services.client.CatalogoServiceClient;
import com.administrativo.administracion_Services.dto.LibroDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/libros")
@AllArgsConstructor
public class AdministracionController {

    @Autowired
    private final CatalogoServiceClient catalogoServiceClient;

    @GetMapping
    public List<LibroDTO> getAllLibros(){
        return catalogoServiceClient.getAllLibros();
    }

    @GetMapping("/genero/{genero}")
    public List<LibroDTO> getLibrosByGenero(@PathVariable String genero) {
        return catalogoServiceClient.getLibroByGenero(genero);
    }
}
