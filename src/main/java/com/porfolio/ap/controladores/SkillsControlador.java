package com.porfolio.ap.controladores;


import com.porfolio.ap.modelos.Skills;
import com.porfolio.ap.servicios.ISkillsServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/skills")
public class SkillsControlador {
    @Autowired
    private ISkillsServicio skillsServicio;

    @GetMapping
    public ResponseEntity<?> TraerSkills() {return ResponseEntity.ok(skillsServicio.buscarSkills());}

    @PostMapping
    public ResponseEntity<?> CrearSkills(@RequestBody Skills skills) {
        return ResponseEntity.status(HttpStatus.CREATED).body(skillsServicio.crearSkills(skills));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> TraerSkills(@PathVariable Long id){
        Optional<Skills> oSkills = skillsServicio.buscarSkills(id);
        if (oSkills.isPresent()) {
            return ResponseEntity.ok(oSkills);
        }
        return ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> editarSkills(@PathVariable Long id, @RequestBody Skills skills){
        Optional<Skills> oSkills = skillsServicio.buscarSkills(id);
        if (oSkills.isPresent()) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(skillsServicio.crearSkills(skills));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSkills(@PathVariable Long id) {
        Optional<Skills> oSkills = skillsServicio.buscarSkills(id);
        if (oSkills.isPresent()) {
            skillsServicio.borrarSkills(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.notFound().build();
    }
}


