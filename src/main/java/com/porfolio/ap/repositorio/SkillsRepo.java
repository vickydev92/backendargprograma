package com.porfolio.ap.repositorio;

import com.porfolio.ap.modelos.Educacion;
import com.porfolio.ap.modelos.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends JpaRepository<Skills, Long> {
}
