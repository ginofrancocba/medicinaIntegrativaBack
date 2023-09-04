package com.clinica.medicinaIntegrativa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String obraSocial;
    private Integer numObraSocial;
    private Integer numTelefono;
    private String direccion;


    public Paciente(String id) {

        this.id = Integer.parseInt(id);
    }
}
