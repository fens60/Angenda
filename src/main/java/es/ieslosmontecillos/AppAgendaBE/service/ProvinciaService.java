package es.ieslosmontecillos.AppAgendaBE.service;

import es.ieslosmontecillos.AppAgendaBE.entity.Provincia;
import java.util.List;
public interface ProvinciaService {
    public List<Provincia> findAll();
    public Provincia save(Provincia provincia);
    public Provincia findById(Long id);
    public void delete(Provincia provincia);
}