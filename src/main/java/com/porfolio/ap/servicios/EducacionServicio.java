package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Educacion;
import com.porfolio.ap.repositorio.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
    public class EducacionServicio implements IEducacionServicio {
        @Autowired
        private EducacionRepo educacionRepo;
        @Override
        public List<Educacion> buscarEducaciones() {
            return educacionRepo.findAll();
        }

        @Override
        public Educacion crearEducacion(Educacion edu) {
            return educacionRepo.save(edu);
        }

        @Override
        public void borrarEducacion(Long id) {
            educacionRepo.deleteById(id);

        }

        @Override
        public Optional<Educacion> buscarEducacion(Long id) {
            return educacionRepo.findById(id);
        }
    }


