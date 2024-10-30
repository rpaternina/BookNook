package com.user.user_Services.controllers;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/private")
@RequiredArgsConstructor
public class PrivateController {

    @GetMapping("/home")
    public String home(){
        return "Home privado";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('admin')") //solo los usuarios con el rol de admin pueden ingresar aqui
    public String admin(){
        return "Admin";
    }
}
