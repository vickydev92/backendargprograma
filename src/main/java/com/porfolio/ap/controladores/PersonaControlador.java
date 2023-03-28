package com.porfolio.ap.controladores;

import com.porfolio.ap.modelos.Persona;
import com.porfolio.ap.servicios.IPersonaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/personas")
public class PersonaControlador {
    @Autowired
    private IPersonaServicio personaServicio;
    @GetMapping
    public ResponseEntity<?> TraerPersonas() {return ResponseEntity.ok(personaServicio.buscarPersonas());}

    @PostMapping
    public ResponseEntity<?> CrearPersona(@RequestBody Persona persona) {
        return ResponseEntity.status(HttpStatus.CREATED).body(personaServicio.crearPersona(persona));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> TraerPersona(@PathVariable Long id){
        Optional<Persona> oPersona = personaServicio.buscarPersona(id);
        if (oPersona.isPresent()) {
            return ResponseEntity.ok(oPersona);
        }
        return ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> editarPersona(@PathVariable Long id, @RequestBody Persona persona){
        Optional<Persona> oPersona = personaServicio.buscarPersona(id);
        if (oPersona.isPresent()) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(personaServicio.crearPersona(persona));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePersona(@PathVariable Long id) {
        Optional<Persona> oPersona = personaServicio.buscarPersona(id);
        if (oPersona.isPresent()) {
            personaServicio.borrarPersona(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }
}
