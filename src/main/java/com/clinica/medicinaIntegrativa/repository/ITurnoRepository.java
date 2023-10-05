package com.clinica.medicinaIntegrativa.repository;

import com.clinica.medicinaIntegrativa.entity.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurnoRepository extends JpaRepository<Turno, Integer> {
}
