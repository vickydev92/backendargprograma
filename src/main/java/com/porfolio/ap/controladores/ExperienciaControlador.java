package com.porfolio.ap.controladores;


import com.porfolio.ap.modelos.Educacion;
import com.porfolio.ap.modelos.Experiencia;
import com.porfolio.ap.servicios.IExperienciaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaControlador {

    @Autowired
    private IExperienciaServicio experienciaServicio;
    @GetMapping
    public ResponseEntity<?> TraerExperiencias() {return ResponseEntity.ok(experienciaServicio.buscarExperiencias());}
    @PostMapping
    public ResponseEntity<?> CrearExperiencia(@RequestBody Experiencia experiencia) {
        return ResponseEntity.status(HttpStatus.CREATED).body(experienciaServicio.crearExperiencia(experiencia));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> TraerEducacion(@PathVariable Long id){
        Optional<Experiencia> oExperiencia = experienciaServicio.buscarExperiencia(id);
        if (oExperiencia.isPresent()) {
            return ResponseEntity.ok(oExperiencia);
        }
        return ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> editarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        Optional<Experiencia> oExperiencia = experienciaServicio.buscarExperiencia(id);
        if (oExperiencia.isPresent()) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(experienciaServicio.crearExperiencia(experiencia));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteExperiencia(@PathVariable Long id) {
        Optional<Experiencia> oExperiencia = experienciaServicio.buscarExperiencia(id);
        if (oExperiencia.isPresent()) {
            experienciaServicio.borrarExperiencia(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }
}
