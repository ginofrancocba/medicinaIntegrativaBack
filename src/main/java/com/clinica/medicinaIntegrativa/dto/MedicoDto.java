package com.clinica.medicinaIntegrativa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class MedicoDto {

    private Integer id;
    private String nombre;
    private String apellido;
}
