package com.clinica.medicinaIntegrativa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    private Integer id;

    private String username;
    private String password;
    private boolean admin;
}
