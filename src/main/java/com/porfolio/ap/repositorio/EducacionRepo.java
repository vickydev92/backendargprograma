package com.porfolio.ap.repositorio;

import com.porfolio.ap.modelos.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepo extends JpaRepository<Educacion, Long> {
}
