package com.clinica.medicinaIntegrativa.sevices;

import com.clinica.medicinaIntegrativa.entity.Paciente;

public class PacienteService {

    public Paciente crearPaciente() {
        Paciente paciente = new Paciente(1, "Franco", "Gonzalo" );
        return paciente;
    }
}
