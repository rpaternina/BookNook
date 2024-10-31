package com.libros.catalogo_Services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class CatalogoConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                // Todas las rutas que tengan el sufijo public seran publicas
                .authorizeHttpRequests(auth -> auth.requestMatchers("/api/public/libros/**").permitAll()
                        // Las que tengan private van a ser privadas
                        .requestMatchers("/api/private/libros/**").authenticated()
                        // Los que sean admin van a necesitar autenticacion
                        /*.requestMatchers("/api/private/libros/add")
                        .hasAuthority("admin").anyRequest().authenticated())*/)
                .formLogin(Customizer.withDefaults())
                .build();
    }



}
