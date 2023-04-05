package com.porfolio.ap.controladores;
import com.porfolio.ap.modelos.Educacion;
import com.porfolio.ap.servicios.IEducacionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionControlador {

        @Autowired
        private IEducacionServicio educacionServicio;
        @GetMapping
        public ResponseEntity<?> TraerEducaciones() {return ResponseEntity.ok(educacionServicio.buscarEducaciones());}
        @PostMapping
        public ResponseEntity<?> CrearEducacion(@RequestBody Educacion educacion) {
                return ResponseEntity.status(HttpStatus.CREATED).body(educacionServicio.crearEducacion(educacion));
        }
        @GetMapping("/{id}")
        public ResponseEntity<?> TraerEducacion(@PathVariable Long id){
                Optional<Educacion> oEdu = educacionServicio.buscarEducacion(id);
                if (oEdu.isPresent()) {
                        return ResponseEntity.ok(oEdu);
                }
                return ResponseEntity.notFound().build();
        }
        @PutMapping("/{id}")
        public ResponseEntity<?> editarEducacion(@PathVariable Long id, @RequestBody Educacion educacion){
                Optional<Educacion> oEdu = educacionServicio.buscarEducacion(id);
                if (oEdu.isPresent()) {
                        return ResponseEntity.status(HttpStatus.ACCEPTED).body(educacionServicio.crearEducacion(educacion));
                }
                return ResponseEntity.notFound().build();
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<?> deleteEducacion(@PathVariable Long id) {
                Optional<Educacion> oEdu = educacionServicio.buscarEducacion(id);
                if (oEdu.isPresent()) {
                        educacionServicio.borrarEducacion(id);
                        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
                }
                return ResponseEntity.notFound().build();
        }
}
