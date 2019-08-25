package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pruebas", catalog = "shsolutions")
public class Pruebas {

    private Integer idPrueba;
    private String nombre;

    public Pruebas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPrueba", nullable = false)
    public Integer getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(Integer idPrueba) {
        this.idPrueba = idPrueba;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pruebas pruebas = (Pruebas) o;
        return Objects.equals(getIdPrueba(), pruebas.getIdPrueba()) &&
                Objects.equals(getNombre(), pruebas.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPrueba(), getNombre());
    }
}
