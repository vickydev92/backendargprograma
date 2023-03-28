package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Skills;
import com.porfolio.ap.modelos.Skills;

import java.util.List;
import java.util.Optional;

public interface ISkillsServicio {
        public List<Skills> buscarSkills();
        public Skills crearSkills(Skills skills);
        public void borrarSkills (Long id);
        public Optional buscarSkills(Long id);
    }


