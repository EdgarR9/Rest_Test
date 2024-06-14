package com.edgar.test.controller;

import com.edgar.test.entity.Persona;
import com.edgar.test.repository.PersonaRepository;
import com.edgar.test.response.Respuesta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    @CrossOrigin
    @PostMapping("/guardar")
    public Respuesta guardarPersona(@RequestBody Persona persona){
        personaRepository.save(persona);
        return new Respuesta("El registro de " + persona.getNombre() + ", próximamente tendrás " + sumaEdad(persona.getEdad()) + " años");
    }

    @GetMapping
    public Iterable<Persona> obtenerPersonas() {
        return personaRepository.findAll();
    }

    private int sumaEdad(int edad) {
        return edad + 1;
    }
}
