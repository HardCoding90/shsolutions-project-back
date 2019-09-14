package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "direcciones", catalog = "shsolutions")
public class Direcciones {

    private Integer idDireccion;
    private Integer idMunicipio;
    private String direccion;
    private String barrio;
    private Boolean indicadorHabilitado;

    public Direcciones() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDireccion")
    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    @Basic
    @Column(name = "IdMunicipio")
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    @Basic
    @Column(name = "Direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "Barrio")
    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direcciones that = (Direcciones) o;
        return Objects.equals(getIdDireccion(), that.getIdDireccion()) &&
                Objects.equals(getIdMunicipio(), that.getIdMunicipio()) &&
                Objects.equals(getDireccion(), that.getDireccion()) &&
                Objects.equals(getBarrio(), that.getBarrio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdDireccion(), getIdMunicipio(), getDireccion(), getBarrio());
    }
}
