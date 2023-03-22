package com.porfolio.ap.controlador;

import com.porfolio.ap.modelos.Persona;
import com.porfolio.ap.servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaControlador {
    @Autowired
    private final PersonaService personaService;

    public PersonaControlador (PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> obtenerPersona(@PathVariable("id") Long id){
        Persona persona=personaService.buscarPersona(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        Persona updatePersona=personaService.crearPersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
}
