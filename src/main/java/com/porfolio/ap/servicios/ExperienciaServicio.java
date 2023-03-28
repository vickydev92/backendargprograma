package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Experiencia;
import com.porfolio.ap.repositorio.ExperienciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExperienciaServicio implements IExperienciaServicio {
    @Autowired
    private ExperienciaRepo experienciaRepo;
    @Override
    public List<Experiencia> buscarExperiencias() {
        return experienciaRepo.findAll();
    }

    @Override
    public Experiencia crearExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }

    @Override
    public void borrarExperiencia(Long id) {
        experienciaRepo.deleteById(id);

    }

    @Override
    public Optional<Experiencia> buscarExperiencia(Long id) {
        return experienciaRepo.findById(id);
    }
}


