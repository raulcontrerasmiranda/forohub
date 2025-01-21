package com.alura.forohub.controlador;

import com.alura.forohub.dto.AuthRequest;
import com.alura.forohub.dto.AuthResponse;
import com.alura.forohub.seguridad.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        // Valida el email y contraseña (puedes agregar lógica real aquí)
        if ("user@example.com".equals(request.getEmail()) && "password".equals(request.getPassword())) {
            // Genera un token JWT
            String token = jwtUtil.generateToken(request.getEmail());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Credenciales inválidas");
        }
    }
}