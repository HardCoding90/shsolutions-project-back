package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telefonos", catalog = "shsolutions")
public class Telefonos {

    private Integer idTelefono;
    private String telefono;
    private Boolean indicadorHabilitado;

    public Telefonos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTelefono")
    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    @Basic
    @Column(name = "Telefono")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        Telefonos telefonos = (Telefonos) o;
        return Objects.equals(getIdTelefono(), telefonos.getIdTelefono()) &&
                Objects.equals(getTelefono(), telefonos.getTelefono()) &&
                Objects.equals(getIndicadorHabilitado(), telefonos.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdTelefono(), getTelefono(), getIndicadorHabilitado());
    }
}
