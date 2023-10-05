package com.clinica.medicinaIntegrativa.repository;

import com.clinica.medicinaIntegrativa.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer> {
}
