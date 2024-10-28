package es.ieslosmontecillos.AppAgendaBE.Dao;

import es.ieslosmontecillos.AppAgendaBE.entity.Persona;
import es.ieslosmontecillos.AppAgendaBE.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<Persona, Long>
{

}
