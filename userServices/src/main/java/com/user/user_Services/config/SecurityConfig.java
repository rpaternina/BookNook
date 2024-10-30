package com.user.user_Services.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf -> csrf.disable()) // Desactiva csrf
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/usuarios/registrar","api/usuarios/login","/api/libros",
                                "/api/libros/genero/{genero}", "/api/libros/nombre/{nombre}" ,
                                "/api/libros/autor/{autor}"
                        ).permitAll()// Permite acceso sin login a rutas publicas
                        .anyRequest().authenticated()); // Requiere autenticacion para cualquier otra ruta
               /* .formLogin(form -> form // Configura el formulario de inicio de sesion
                        .loginPage("/api/libros") //Ruta personalizada para la pagina de inicio de sesion
                        .permitAll()) // Permite acceso a todos a la pagina de inicio de sesion
                .logout(logout -> logout //Configura la funcionalidad de cierre de sesion
                        .permitAll());*/ // Permite acceso a todos para cerrar sesion

        return http.build();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
