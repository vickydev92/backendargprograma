package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Educacion;
import java.util.List;
import java.util.Optional;

public interface IEducacionServicio {
        public List<Educacion> buscarEducaciones();
        public Educacion crearEducacion(Educacion edu);
        public void borrarEducacion (Long id);
        public Optional buscarEducacion (Long id);
    }


