package com.user.user_Services.repository;

import com.user.user_Services.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByCorreoElectronico(String correoElectronico);
}
