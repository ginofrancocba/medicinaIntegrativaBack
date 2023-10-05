package com.clinica.medicinaIntegrativa.dto;

import com.clinica.medicinaIntegrativa.entity.Medico;
import com.clinica.medicinaIntegrativa.entity.Paciente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TurnoDto {

    private Integer id;
    private LocalDate fecha;
    private LocalTime hora;

    private Paciente paciente;
    private Medico medico;
}
