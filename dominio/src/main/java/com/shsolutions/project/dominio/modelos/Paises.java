package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "paises", catalog = "shsolutions")
public class Paises implements Serializable {
    
    private Integer idPais;
    private String codigo;
    private String pais;
    private Boolean indicadorHabilitado;

    public Paises() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdPais")
    public Integer getIdPais() {
        return idPais;
    }

    public void setIdPais(Integer idPais) {
        this.idPais = idPais;
    }

    @Basic
    @Column(name = "Codigo")
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "Pais")
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        Paises paises = (Paises) o;
        return Objects.equals(getIdPais(), paises.getIdPais()) &&
                Objects.equals(getCodigo(), paises.getCodigo()) &&
                Objects.equals(getPais(), paises.getPais()) &&
                Objects.equals(getIndicadorHabilitado(), paises.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPais(), getCodigo(), getPais(), getIndicadorHabilitado());
    }
}
