package com.webhospital.agenda_consultas.controller;

import com.webhospital.agenda_consultas.model.Medico;
import com.webhospital.agenda_consultas.service.MedicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService){
        this.medicoService = medicoService;
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listarMedicos(){
        List<Medico> medicos = medicoService.buscarTodos();
        return ResponseEntity.ok(medicos);
    }


}
