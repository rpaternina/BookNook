package com.user.user_Services.services;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import com.user.user_Services.entity.User;
import io.jsonwebtoken.Jwts;

import java.util.Date;


@Service
public class JwtService {

    private final String secretKey = "12345"; // Debe ser una clave segura

    public String generateToken(User user) {
        return Jwts.builder()
                .setSubject(user.getCorreoElectronico())
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 864_000_000)) // 10 días
                .signWith(SignatureAlgorithm.HS512, secretKey)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }


}
