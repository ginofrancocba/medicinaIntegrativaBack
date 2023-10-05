package com.clinica.medicinaIntegrativa.controller;

import com.clinica.medicinaIntegrativa.dto.MedicoDto;
import com.clinica.medicinaIntegrativa.sevice.MedicoService;
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
@RequestMapping ("/medicos")

public class MedicoController {

    @Autowired
    private MedicoService service;

    @PostMapping()
    public ResponseEntity<?> agregarMedico(@RequestBody MedicoDto medico){
        service.agregar(medico);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarMedico(@RequestBody MedicoDto medicoDto){
        service.modificar(medicoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarMedico(@PathVariable Integer id){
        service.eliminar(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<MedicoDto> getTodosMedicos(){

        return service.getTodos();
    }

}
