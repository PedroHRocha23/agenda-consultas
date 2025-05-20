package com.webhospital.agenda_consultas.repository;

import com.webhospital.agenda_consultas.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    //adicionar métodos customizados depois, como findByCrm, etc.
}
