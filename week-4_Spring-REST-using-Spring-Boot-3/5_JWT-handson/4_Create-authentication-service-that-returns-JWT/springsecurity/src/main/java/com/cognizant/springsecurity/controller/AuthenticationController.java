package com.cognizant.springsecurity.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.AuthenticationException; 
import java.util.Base64;
import com.cognizant.springsecurity.util.JwtUtil;
@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtUtil jwtUtil;
    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header");
        }
        String base64Credentials = authHeader.substring("Basic ".length()).trim();
        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);
        String[] credentials = new String(decodedBytes).split(":", 2);
        String username = credentials[0];
        String password = credentials[1];
        try {
            Authentication auth = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
            String token = jwtUtil.generateToken(auth.getName());
            return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
        } catch (AuthenticationException e) {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
