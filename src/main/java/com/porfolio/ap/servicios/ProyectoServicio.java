package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Proyecto;
import com.porfolio.ap.repositorio.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProyectoServicio implements IProyectoServicio {
    @Autowired
    private ProyectoRepo proyectoRepo;

    @Override
    public List<Proyecto> buscarProyectos() {
        return proyectoRepo.findAll();
    }

    @Override
    public Proyecto crearProyecto(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    @Override
    public void borrarProyecto(Long id) {
        proyectoRepo.deleteById(id);

    }

    @Override
    public Optional buscarProyecto(Long id) {
        return proyectoRepo.findById(id);
    }
}
