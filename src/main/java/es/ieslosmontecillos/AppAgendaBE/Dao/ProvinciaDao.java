package es.ieslosmontecillos.AppAgendaBE.Dao;

import es.ieslosmontecillos.AppAgendaBE.entity.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProvinciaDao extends JpaRepository<Provincia, Long> {

}
