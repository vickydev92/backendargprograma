package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Proyecto;

import java.util.List;
import java.util.Optional;

public interface IProyectoServicio {
    public List<Proyecto> buscarProyectos();
    public Proyecto crearProyecto(Proyecto proyecto);
    public void borrarProyecto (Long id);
    public Optional buscarProyecto (Long id);
}
