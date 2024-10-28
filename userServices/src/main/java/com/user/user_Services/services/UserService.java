package com.user.user_Services.services;


import com.user.user_Services.entity.User;
import com.user.user_Services.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final PasswordEncoder passwordEncoder;

    // Crear Usuario
    public User crearUsuario(User user){
        user.setContrasena(passwordEncoder.encode(user.getContrasena())); //Cifra la contraseña
        return userRepository.save(user);
    }

    public Optional<User> findBycorreo(String correoElectronico){
        return userRepository.findByCorreoElectronico(correoElectronico);
    }
}
