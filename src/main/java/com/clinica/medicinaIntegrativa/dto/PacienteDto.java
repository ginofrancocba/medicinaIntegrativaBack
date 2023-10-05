package com.clinica.medicinaIntegrativa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PacienteDto {

    private Integer id;
    private String nombre;
    private String apellido;
}
