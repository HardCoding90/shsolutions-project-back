package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "generos", catalog = "shsolutions")
public class Generos {

    private Integer idGenero;
    private String codigo;
    private String genero;
    private Boolean indicadorHabilitado;

    public Generos() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdGenero")
    public Integer getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
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
    @Column(name = "Genero")
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
        Generos generos = (Generos) o;
        return Objects.equals(getIdGenero(), generos.getIdGenero()) &&
                Objects.equals(getCodigo(), generos.getCodigo()) &&
                Objects.equals(getGenero(), generos.getGenero()) &&
                Objects.equals(getIndicadorHabilitado(), generos.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdGenero(), getCodigo(), getGenero(), getIndicadorHabilitado());
    }
}
