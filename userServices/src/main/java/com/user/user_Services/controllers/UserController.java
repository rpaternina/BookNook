package com.user.user_Services.controllers;


import com.user.user_Services.entity.User;
import com.user.user_Services.entity.dto.LoginRequest;
import com.user.user_Services.services.JwtService;
import com.user.user_Services.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UserController {


    @Autowired
    private final UserService userService;

    @Autowired
    private final JwtService jwtService;

    @PostMapping("/registrar")
    @ResponseStatus(HttpStatus.CREATED)
    public User registrarUsuario(@RequestBody User user){
        return userService.crearUsuario(user);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
        Optional<User> userOpt = userService.findBycorreo(loginRequest.getCorreoElectronico());

        if (userOpt.isPresent()) {
            User user = userOpt.get();
            if (userService.validatePassword(loginRequest.getContrasena(), user.getContrasena())) {
                String token = jwtService.generateToken(user);
                return ResponseEntity.ok(token);
            }
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas");
    }

}
