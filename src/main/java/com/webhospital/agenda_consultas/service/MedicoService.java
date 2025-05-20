package com.webhospital.agenda_consultas.service;

import com.webhospital.agenda_consultas.model.Medico;
import com.webhospital.agenda_consultas.repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository){
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> buscarTodos(){
        return medicoRepository.findAll();
    }
}
