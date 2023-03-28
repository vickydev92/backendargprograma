package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Persona;
import com.porfolio.ap.repositorio.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServicio implements IPersonaServicio {
    @Autowired
    private PersonaRepo personaRepo;
    @Override
    public List<Persona> buscarPersonas() {
        return personaRepo.findAll();
    }

    @Override
    public Persona crearPersona(Persona per) {
        return personaRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);

    }

    @Override
    public Optional<Persona> buscarPersona(Long id) {
        return personaRepo.findById(id);
    }
}
