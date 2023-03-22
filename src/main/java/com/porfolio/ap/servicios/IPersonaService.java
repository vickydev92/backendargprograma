package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> buscarPersona();

    public Persona crearPersona(Persona per);

    public void borrarPersona( Long id);

    public Persona buscarPersona( Long id);

}
