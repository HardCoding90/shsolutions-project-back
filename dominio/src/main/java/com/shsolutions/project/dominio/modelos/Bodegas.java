package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bodegas", catalog = "shsolutions")
public class Bodegas {

    private Integer idBodega;
    private Integer idMunicipio;
    private String bodega;
    private String codigo;
    private Boolean indicadorHabilitado;

    public Bodegas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdBodega")
    public Integer getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Integer idBodega) {
        this.idBodega = idBodega;
    }

    @Basic
    @Column(name = "Bodega")
    public String getBodega() {
        return bodega;
    }

    public void setBodega(String bodega) {
        this.bodega = bodega;
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
    @Column(name = "IdMunicipio")
    public Integer getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Integer idMunicipio) {
        this.idMunicipio = idMunicipio;
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
        Bodegas bodegas = (Bodegas) o;
        return Objects.equals(getIdBodega(), bodegas.getIdBodega()) &&
                Objects.equals(getBodega(), bodegas.getBodega()) &&
                Objects.equals(getCodigo(), bodegas.getCodigo()) &&
                Objects.equals(getIndicadorHabilitado(), bodegas.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdBodega(), getBodega(), getCodigo(), getIndicadorHabilitado());
    }
}
