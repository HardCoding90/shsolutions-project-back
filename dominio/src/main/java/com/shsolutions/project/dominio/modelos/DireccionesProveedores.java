package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "direccionesproveedores", catalog = "shsolutions")
public class DireccionesProveedores {

    private Integer idDireccionProveedor;
    private Integer idDireccion;
    private Integer idProveedor;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public DireccionesProveedores() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdDireccionProveedor")
    public Integer getIdDireccionProveedor() {
        return idDireccionProveedor;
    }

    public void setIdDireccionProveedor(Integer idDireccionProveedor) {
        this.idDireccionProveedor = idDireccionProveedor;
    }

    @Basic
    @Column(name = "IdDireccion")
    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    @Basic
    @Column(name = "IdProveedor")
    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Basic
    @Column(name = "IndicadorPrincipal")
    public Boolean getIndicadorPrincipal() {
        return indicadorPrincipal;
    }

    public void setIndicadorPrincipal(Boolean indicadorPrincipal) {
        this.indicadorPrincipal = indicadorPrincipal;
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
        DireccionesProveedores that = (DireccionesProveedores) o;
        return Objects.equals(getIdDireccionProveedor(), that.getIdDireccionProveedor()) &&
                Objects.equals(getIdDireccion(), that.getIdDireccion()) &&
                Objects.equals(getIdProveedor(), that.getIdProveedor()) &&
                Objects.equals(getIndicadorPrincipal(), that.getIndicadorPrincipal()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdDireccionProveedor(), getIdDireccion(), getIdProveedor(), getIndicadorPrincipal(), getIndicadorHabilitado());
    }
}
