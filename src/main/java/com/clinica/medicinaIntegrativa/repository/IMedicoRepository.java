package com.clinica.medicinaIntegrativa.repository;

import com.clinica.medicinaIntegrativa.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicoRepository extends JpaRepository <Medico, Integer> {
}
