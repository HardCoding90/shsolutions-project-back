package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;

@Entity
@Table(name = "paises", catalog = "shsolutions")
public class Paises {
    private Integer idPais;
    private String codigo;
    private String pais;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Paises paises = (Paises) o;

        if (idPais != null ? !idPais.equals(paises.idPais) : paises.idPais != null) return false;
        if (codigo != null ? !codigo.equals(paises.codigo) : paises.codigo != null) return false;
        if (pais != null ? !pais.equals(paises.pais) : paises.pais != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPais != null ? idPais.hashCode() : 0;
        result = 31 * result + (codigo != null ? codigo.hashCode() : 0);
        result = 31 * result + (pais != null ? pais.hashCode() : 0);
        return result;
    }
}
