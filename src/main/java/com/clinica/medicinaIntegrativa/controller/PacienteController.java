package com.clinica.medicinaIntegrativa.controller;

import ch.qos.logback.core.model.Model;
import com.clinica.medicinaIntegrativa.dto.PacienteDto;
import com.clinica.medicinaIntegrativa.exception.ResourceNotFoundException;
import com.clinica.medicinaIntegrativa.sevice.PacienteService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;

    @PostMapping()
    public ResponseEntity<?>agregarPaciente(@RequestBody PacienteDto pacienteDto){
        pacienteService.agregarPaciente(pacienteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarPaciente(@RequestBody PacienteDto pacienteDto){
        pacienteService.modificarPaciente(pacienteDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable Integer id) throws ResourceNotFoundException {
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.ok("eliminado");
    }

    @GetMapping()
    public Collection<PacienteDto> getTodosPacientes() {

        return pacienteService.getTodos();
    }


}
