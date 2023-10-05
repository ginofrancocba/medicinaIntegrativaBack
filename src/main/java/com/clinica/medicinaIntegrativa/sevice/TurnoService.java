package com.clinica.medicinaIntegrativa.sevice;

import com.clinica.medicinaIntegrativa.dto.TurnoDto;
import com.clinica.medicinaIntegrativa.entity.Turno;
import com.clinica.medicinaIntegrativa.repository.ITurnoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class TurnoService {

    @Autowired
    private ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    public void agregarTurno(TurnoDto turnoDto){
        Turno turno = mapper.convertValue(turnoDto, Turno.class);
        turnoRepository.save(turno);
    }

    public void modificarTurno(TurnoDto turnoDto) {
        agregarTurno(turnoDto);
    }

    public void eliminarTurno(Integer id) {
        turnoRepository.deleteById(id);
    }

    public Set<TurnoDto> getTodos() {
        List<Turno> turnos = turnoRepository.findAll();
        Set<TurnoDto> turnosDto = new HashSet<>();

        for (Turno turno : turnos) {
            turnosDto.add(mapper.convertValue(turno, TurnoDto.class));
        }
        return turnosDto;
    }
}
