package com.user.user_Services.controllers;


import com.user.user_Services.entity.User;
import com.user.user_Services.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public User registrarUsuario(@RequestBody User user){
        return userService.crearUsuario(user);
    }

    /*
    @PostMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> login(@RequestBody)*/
}
