package com.clinica.medicinaIntegrativa.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController {

    @GetMapping("/index")
    public String welcome(Model model) {
        model.addText("nombre");
        return "index";

    }


}
