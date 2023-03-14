package com.porfolio.ap.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkills;
    private String nombreSkills;
    private String fotoSkills;
    private int porcentaje;


    public Skills() {
    }

    public Skills(Long idSkills, String nombreSkills, String fotoSkills, int porcentaje) {
        this.idSkills = idSkills;
        this.nombreSkills = nombreSkills;
        this.fotoSkills = fotoSkills;
        this.porcentaje = porcentaje;
    }

    public Long getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(Long idSkills) {
        this.idSkills = idSkills;
    }

    public String getNombreSkills() {
        return nombreSkills;
    }

    public void setNombreSkills(String nombreSkills) {
        this.nombreSkills = nombreSkills;
    }

    public String getFotoSkills() {
        return fotoSkills;
    }

    public void setFotoSkills(String fotoSkills) {
        this.fotoSkills = fotoSkills;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
}
