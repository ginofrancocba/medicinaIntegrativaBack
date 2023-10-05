package com.clinica.medicinaIntegrativa.controller;

import com.clinica.medicinaIntegrativa.dto.LoginFormDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class LoginController {
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginFormDto loginForm) {
        // Obtener los valores del formulario
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        // Realizar la validación en la base de datos H2
        boolean isValid = validateUser(username, password);

        if (isValid) {
            return ResponseEntity.ok().body("{\"success\": true}");
        } else {
            return ResponseEntity.ok().body("{\"success\": false}");
        }
    }
    private boolean validateUser(String username, String password) {
        // Lógica de validación del usuario en la base de datos H2
        // Implementa tu lógica de validación aquí y devuelve true si el usuario es válido, o false si no lo es.
        // Puedes realizar consultas a la base de datos H2 utilizando JPA o JDBC, según tu configuración.
        // Por ejemplo, podrías buscar el usuario en la base de datos y verificar si la contraseña coincide.

        // Ejemplo de validación simple (solo para demostración)
        return username.equals("admin") && password.equals("password");
    }
}
