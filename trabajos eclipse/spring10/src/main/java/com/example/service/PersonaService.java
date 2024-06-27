package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.pojos.Persona;

@Service
public class PersonaService {

    private List<Persona> listOfPeople;
	private Object persona;
	private int nextId;
    public PersonaService() {
        this.listOfPeople = new ArrayList<>();
        this.nextId = 1;
        // Inicializar la lista con algunos datos
        this.listOfPeople.add(new Persona(nextId++, "David", "Bernal González", 33));
        this.listOfPeople.add(new Persona(nextId++, "Eric", "Alessi", 24));
        this.listOfPeople.add(new Persona(nextId++, "Ana", "Smith", 28));
        this.listOfPeople.add(new Persona(nextId++, "María", "García", 30));
        this.listOfPeople.add(new Persona(nextId++, "John", "Doe", 40));
        this.listOfPeople.add(new Persona(nextId++, "Alice", "Johnson", 22));
        this.listOfPeople.add(new Persona(nextId++, "Michael", "Brown", 35));
        this.listOfPeople.add(new Persona(nextId++, "Sara", "Miller", 27));
        this.listOfPeople.add(new Persona(nextId++, "Carlos", "Martínez", 31));
        this.listOfPeople.add(new Persona(nextId++, "Laura", "Taylor", 29));
        this.listOfPeople.add(new Persona(nextId++, "James", "Anderson", 25));
        this.listOfPeople.add(new Persona(nextId++, "Emily", "Williams", 26));
        this.listOfPeople.add(new Persona(nextId++, "Daniel", "Wilson", 38));
        this.listOfPeople.add(new Persona(nextId++, "Sophia", "Moore", 23));
        this.listOfPeople.add(new Persona(nextId++, "Matthew", "Jackson", 32));
        this.listOfPeople.add(new Persona(nextId++, "Olivia", "White", 36));
        this.listOfPeople.add(new Persona(nextId++, "William", "Thompson", 27));
        this.listOfPeople.add(new Persona(nextId++, "Isabella", "Harris", 29));
        this.listOfPeople.add(new Persona(nextId++, "Ethan", "Clark", 31));
        this.listOfPeople.add(new Persona(nextId++, "Ava", "Lewis", 34));
    }

    public List<Persona> getListOfPeople() {
        return listOfPeople;
    }

    public void crearPersona(Persona nuevaPersona) {
        nuevaPersona.setId(nextId++);
        listOfPeople.add(nuevaPersona);
    }

    public boolean deletePersona(int id) {
        Optional<Persona> personaToRemove = listOfPeople.stream()
                .filter(persona -> persona.getId() == id)
                .findFirst();

        if (personaToRemove.isPresent()) {
            listOfPeople.remove(personaToRemove.get());
            return true;
        } else {
            return false;
        }
    }

	
	public Object getPersona() {
		return persona;
	}
	
	public Optional<Persona> getPersonaById(int id) {
	    return listOfPeople.stream()
	            .filter(persona -> persona.getId() == id)
	            .findFirst();
	}


	public void setPersona(Object persona) {
		this.persona = persona;
	}


}
