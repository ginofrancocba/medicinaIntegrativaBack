package com.clinica.medicinaIntegrativa.repository;

import com.clinica.medicinaIntegrativa.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
}
