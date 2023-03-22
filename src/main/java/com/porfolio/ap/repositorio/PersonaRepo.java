package com.porfolio.ap.repositorio;

import com.porfolio.ap.modelos.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {

}
