package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojos.Persona;
import com.example.service.PersonaService;

@RestController
@RequestMapping("/")
public class HomeController {

    private final PersonaService personaService;

    
    public HomeController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public ResponseEntity<List<Persona>> getAllPersonas() {
        List<Persona> personas = personaService.getListOfPeople();
        return ResponseEntity.ok(personas);
    }

    @GetMapping("/personas/{id}")
    public ResponseEntity<?> getPersonaById(@PathVariable int id) {
        Optional<Persona> persona = personaService.getPersonaById(id);
        if (persona.isPresent()) {
            return ResponseEntity.ok(persona.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Persona no encontrada con ID: " + id);
        }
    }

    @PostMapping("/personas")
    public ResponseEntity<String> addPersona(@RequestBody Persona persona) {
        personaService.crearPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body("Persona creada correctamente: " + persona.toString());
    }

    @DeleteMapping("/personas/delete/{id}")
    public ResponseEntity<String> deletePersona(@PathVariable int id) {
        boolean isRemoved = personaService.deletePersona(id);
        if (!isRemoved) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Persona eliminada correctamente");
    }
}
