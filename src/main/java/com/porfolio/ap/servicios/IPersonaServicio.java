package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaServicio {
    public List<Persona> buscarPersonas();
    public Persona crearPersona(Persona per);
    public void borrarPersona (Long id);
    public Optional buscarPersona (Long id);
}
