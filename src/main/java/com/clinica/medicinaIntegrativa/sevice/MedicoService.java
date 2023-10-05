package com.clinica.medicinaIntegrativa.sevice;

import com.clinica.medicinaIntegrativa.dto.MedicoDto;
import com.clinica.medicinaIntegrativa.entity.Medico;
import com.clinica.medicinaIntegrativa.repository.IMedicoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MedicoService {

    @Autowired
    private IMedicoRepository medicoRepository;

    @Autowired
    ObjectMapper mapper;


    public void agregar(MedicoDto c) {
        Medico odontologo = mapper.convertValue(c, Medico.class);
        medicoRepository.save(odontologo);
    }

    public void modificar(MedicoDto c) {
        this.agregar(c);
    }

    public void eliminar(Integer id) {
        medicoRepository.deleteById(id);
    }

    public Set<MedicoDto> getTodos() {
        List<Medico> medicos = medicoRepository.findAll();
        Set<MedicoDto> medicosDto = new HashSet<>();

        for(Medico medico: medicos) {
            medicosDto.add(mapper.convertValue(medico, MedicoDto.class));
        }
        return medicosDto;
    }
}
