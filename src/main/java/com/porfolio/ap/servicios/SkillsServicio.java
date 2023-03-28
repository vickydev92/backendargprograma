package com.porfolio.ap.servicios;

import com.porfolio.ap.modelos.Skills;
import com.porfolio.ap.repositorio.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillsServicio implements ISkillsServicio {
    @Autowired
    private SkillsRepo skillsRepo;
    @Override
    public List<Skills> buscarSkills() {
        return skillsRepo.findAll();
    }

    @Override
    public Skills crearSkills(Skills skills) {
        return skillsRepo.save(skills);
    }

    @Override
    public void borrarSkills(Long id) {
        skillsRepo.deleteById(id);

    }

    @Override
    public Optional<Skills> buscarSkills(Long id) {
        return skillsRepo.findById(id);
    }
}


