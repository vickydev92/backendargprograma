package com.porfolio.ap.repositorio;

import com.porfolio.ap.modelos.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
}
