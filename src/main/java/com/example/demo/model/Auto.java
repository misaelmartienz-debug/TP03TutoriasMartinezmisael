package com.example.demo.model;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "auto") // nombre de la tabla en Supabase
public class Auto {

    @Id
    @Column(name = "patente", nullable = false, unique = true)
    private Integer patente; // clave primaria SIN autoincrementar

    @Column
    private String marca;

    @Column
    private String color;

    @Column
    private boolean estado;

    @Column
    private Timestamp fechaRegistro;

    // ======= CONSTRUCTORES =======
    public Auto() {}

    public Auto(Integer patente, String marca, String color, boolean estado, Timestamp fechaRegistro) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.estado = true;
        this.fechaRegistro = fechaRegistro;
    }

    // ======= GETTERS Y SETTERS =======
    public Integer getPatente() {
        return patente;
    }

    public void setPatente(Integer patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
