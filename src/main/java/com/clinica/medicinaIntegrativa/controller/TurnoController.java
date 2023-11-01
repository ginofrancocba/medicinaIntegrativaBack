package com.clinica.medicinaIntegrativa.controller;

import com.clinica.medicinaIntegrativa.sevice.TurnoService;
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
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    TurnoService turnoService;

    @PostMapping()
    public ResponseEntity<?> agregarTurno(@RequestBody TurnoDto turnoDto){
        turnoService.agregarTurno(turnoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> modificarTurno(@RequestBody TurnoDto turnoDto){
        turnoService.modificarTurno(turnoDto);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable Integer id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping
    public Collection<TurnoDto> getTodosTurnos(){

        return turnoService.getTodos();
    }
}
