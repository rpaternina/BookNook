package com.administrativo.administracion_Services.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LibroDTO {

    private Long id;
    private String nombre;
    private String genero;
    private String autor;
    private String novedades;
    private Float precio;
}
