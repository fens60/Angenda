package es.ieslosmontecillos.AppAgendaBE.Dao;

import es.ieslosmontecillos.AppAgendaBE.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long> {
}

