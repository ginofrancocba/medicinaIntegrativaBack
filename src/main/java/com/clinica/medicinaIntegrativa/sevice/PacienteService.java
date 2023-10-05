package com.clinica.medicinaIntegrativa.sevice;

import com.clinica.medicinaIntegrativa.dto.PacienteDto;
import com.clinica.medicinaIntegrativa.entity.Paciente;
import com.clinica.medicinaIntegrativa.exception.ResourceNotFoundException;
import com.clinica.medicinaIntegrativa.repository.IPacienteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class PacienteService {

    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    ObjectMapper mapper;
    private static final Logger logger = LogManager.getLogger(PacienteService.class);

    public void agregarPaciente(PacienteDto pacienteDto) {
        Paciente paciente = mapper.convertValue(pacienteDto, Paciente.class);
        pacienteRepository.save(paciente);

    }

    public void modificarPaciente(PacienteDto pacienteDto) {
        Paciente paciente = mapper.convertValue(pacienteDto, Paciente.class);
        pacienteRepository.save(paciente);

    }

    public void eliminarPaciente(Integer id) throws ResourceNotFoundException {
        logger.info("Comienza a eliminar");
        if(buscar(id)) {
            throw new ResourceNotFoundException("No existe un paciente con el id: " + id);
        } else {
            pacienteRepository.deleteById(id);
            logger.error("El paciente con id:" + id + "no fue eliminado");
        }
    }

    private boolean buscar(Integer id) {
        return pacienteRepository.findById(id).isPresent();

    }

    public Set<PacienteDto> getTodos() {
        List<Paciente> pacientes = pacienteRepository.findAll();
        Set<PacienteDto> pacientesDto = new HashSet<>();

        for (Paciente paciente : pacientes) {
            pacientesDto.add(mapper.convertValue(paciente, PacienteDto.class));
        }
        return pacientesDto;
    }
}
