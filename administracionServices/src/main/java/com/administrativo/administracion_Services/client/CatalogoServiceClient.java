package com.administrativo.administracion_Services.client;


import com.administrativo.administracion_Services.dto.LibroDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "catalogoServices" , url = "http://localhost:8081")
public interface CatalogoServiceClient {

    @GetMapping("/api/public/libros")
    List<LibroDTO> getAllLibros();

    @GetMapping("/api/public/libros/genero/{genero}")
    List<LibroDTO> getLibroByGenero(@PathVariable("genero") String genero);
}
