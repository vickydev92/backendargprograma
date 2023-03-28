package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Experiencia;

import java.util.List;
import java.util.Optional;

public interface IExperienciaServicio {
        public List<Experiencia> buscarExperiencias();
        public Experiencia crearExperiencia(Experiencia experiencia);
        public void borrarExperiencia (Long id);
        public Optional buscarExperiencia (Long id);
    }


