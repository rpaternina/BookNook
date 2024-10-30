package com.libros.catalogo_Services.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class CatalogoConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desactiva CSRF para aplicaciones sin sesión
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/usuarios/registrar","/api/usuarios/login", "/api/libros",
                                "/api/libros/genero/{genero}", "/api/libros/nombre/{nombre}" ,
                                "/api/libros/autor/{autor}"
                        ).permitAll() // Rutas públicas
                        .anyRequest().authenticated()); // Rutas protegidas

        return http.build();
    }

}
