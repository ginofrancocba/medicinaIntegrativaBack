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
@Table(name = "Especialistas")
public class Especialista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String apellido;
    private String matricula;

    public Especialista(String id) {
        this.id = Integer.parseInt(id);
    }
}
