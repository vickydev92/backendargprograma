package com.porfolio.ap.modelos;


import jakarta.persistence.*;

@Entity
@Table(name = "Skills")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String titulo;
    private String porcentaje;
    private String imagen;

    public Skills() {
    }

    public Skills(Long id, String titulo, String porcentaje, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.imagen = imagen;
        this.porcentaje = porcentaje;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
