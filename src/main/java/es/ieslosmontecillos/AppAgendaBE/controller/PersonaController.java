package es.ieslosmontecillos.AppAgendaBE.controller;

import es.ieslosmontecillos.AppAgendaBE.entity.Persona;
import es.ieslosmontecillos.AppAgendaBE.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PersonaController {

    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/PERSONA")
    public ResponseEntity<Object> getAll() {
        try {
            List<Persona> list = personaService.findAll();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            Map<String, Object> map = new HashMap<>();
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/PERSONA/{id}")
    public ResponseEntity<Object> getById(@PathVariable Long id) {
        Persona persona = personaService.findById(id);
        if (persona == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("message", "Persona not found with id " + id);
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PostMapping("/PERSONA")
    public ResponseEntity<Object> create(@RequestBody Persona persona) {
        try {
            Persona savedPersona = personaService.save(persona);
            return new ResponseEntity<>(savedPersona, HttpStatus.CREATED);
        } catch (Exception e) {
            Map<String, Object> map = new HashMap<>();
            map.put("message", e.getMessage());
            return new ResponseEntity<>(map, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/PERSONA/{id}")
    public ResponseEntity<Object> update(@RequestBody Persona persona, @PathVariable Long id) {
        Persona currentPersona = personaService.findById(id);
        if (currentPersona == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("message", "Persona not found with id " + id);
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }

        currentPersona.setNombre(persona.getNombre());
        currentPersona.setApellidos(persona.getApellidos());
        currentPersona.setTelefono(persona.getTelefono());
        currentPersona.setEmail(persona.getEmail());
        currentPersona.setProvincia(persona.getProvincia());
        currentPersona.setFechaNacimiento(persona.getFechaNacimiento());
        currentPersona.setNumHijos(persona.getNumHijos());
        currentPersona.setEstadoCivil(persona.getEstadoCivil());
        currentPersona.setSalario(persona.getSalario());
        currentPersona.setJubilado(persona.getJubilado());
        currentPersona.setFoto(persona.getFoto());

        Persona updatedPersona = personaService.save(currentPersona);
        return new ResponseEntity<>(updatedPersona, HttpStatus.OK);
    }

    @DeleteMapping("/PERSONA/{id}")
    public ResponseEntity<Object> delete(@PathVariable Long id) {
        Persona currentPersona = personaService.findById(id);
        if (currentPersona == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("message", "Persona not found with id " + id);
            return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
        }

        personaService.delete(currentPersona);
        Map<String, Object> map = new HashMap<>();
        map.put("deleted", true);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
