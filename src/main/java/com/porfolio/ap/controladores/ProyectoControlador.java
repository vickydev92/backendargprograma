package com.porfolio.ap.controladores;

import com.porfolio.ap.modelos.Persona;
import com.porfolio.ap.modelos.Proyecto;
import com.porfolio.ap.servicios.IProyectoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/proyectos")
public class ProyectoControlador {
    @Autowired
    private IProyectoServicio proyectoServicio;

    @GetMapping
    public ResponseEntity<?> TraerProyectos() {return ResponseEntity.ok(proyectoServicio.buscarProyectos());}

    @PostMapping
    public ResponseEntity<?> CrearProyecto(@RequestBody Proyecto proyecto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(proyectoServicio.crearProyecto(proyecto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> TraerProyecto(@PathVariable Long id){
        Optional<Proyecto> oProyecto = proyectoServicio.buscarProyecto(id);
        if (oProyecto.isPresent()) {
            return ResponseEntity.ok(oProyecto);
        }
        return ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> editarProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto){
        Optional<Proyecto> oProyecto = proyectoServicio.buscarProyecto(id);
        if (oProyecto.isPresent()) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(proyectoServicio.crearProyecto(proyecto));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProyecto(@PathVariable Long id) {
        Optional<Proyecto> oProyecto = proyectoServicio.buscarProyecto(id);
        if (oProyecto.isPresent()) {
            proyectoServicio.borrarProyecto(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }
}


