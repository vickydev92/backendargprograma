package com.porfolio.ap.servicios;

import com.porfolio.ap.excepcion.PersonaNoEncontrada;
import com.porfolio.ap.modelos.Persona;
import com.porfolio.ap.repositorio.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonaService implements IPersonaService{
    public PersonaRepo personaRepo;

  @Autowired
    public PersonaService(PersonaRepo personaRepo) {
        this.personaRepo = personaRepo;
    }

  @Override
  public List<Persona> buscarPersona() {
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
  public Persona buscarPersona(Long id) {
    return personaRepo.findById(id).orElseThrow(() -> new PersonaNoEncontrada("persona no encontrada"));
  }

}
