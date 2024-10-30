package com.user.user_Services.controllers;


import com.user.user_Services.entity.User;

import com.user.user_Services.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/public")
@AllArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @GetMapping("/home")
    public String home(){
        return "Bienvenido";
    }

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public User registrarUsuario(@RequestBody User user){
        return userService.crearUsuario(user);
    }



}
