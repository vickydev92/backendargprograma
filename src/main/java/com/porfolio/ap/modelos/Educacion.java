package com.porfolio.ap.modelos;

import jakarta.persistence.*;


    @Entity
    @Table(name = "Educaciones")
    public class Educacion {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false, updatable = false)
        private Long id;
        private String titulo;
        private int fechaIni;
        private int fechaFin;
        private String descripcion;
        private String imagen;

        public Educacion() {
        }

        public Educacion(Long id, String titulo, int fechaIni, int fechaFin, String descripcion, String imagen) {
            this.id = id;
            this.titulo = titulo;
            this.fechaIni = fechaIni;
            this.fechaFin = fechaFin;
            this.descripcion = descripcion;
            this.imagen = imagen;
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

        public int getFechaIni() {
            return fechaIni;
        }

        public void setFechaIni(int fechaIni) {
            this.fechaIni = fechaIni;
        }

        public int getFechaFin() {
            return fechaFin;
        }

        public void setFechaFin(int fechaFin) {
            this.fechaFin = fechaFin;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }
    }

