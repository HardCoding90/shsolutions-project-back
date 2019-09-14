package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telefonosproveedores", catalog = "shsolutions")
public class TelefonosProveedores {

    private Integer idTelefonoProveedor;
    private Integer idTelefono;
    private Integer idProveedor;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public TelefonosProveedores() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdTelefonoProveedor")
    public Integer getIdTelefonoProveedor() {
        return idTelefonoProveedor;
    }

    public void setIdTelefonoProveedor(Integer idTelefonoProveedor) {
        this.idTelefonoProveedor = idTelefonoProveedor;
    }

    @Basic
    @Column(name = "IdTelefono")
    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
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
        TelefonosProveedores that = (TelefonosProveedores) o;
        return Objects.equals(getIdTelefonoProveedor(), that.getIdTelefonoProveedor()) &&
                Objects.equals(getIdTelefono(), that.getIdTelefono()) &&
                Objects.equals(getIdProveedor(), that.getIdProveedor()) &&
                Objects.equals(getIndicadorPrincipal(), that.getIndicadorPrincipal()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdTelefonoProveedor(), getIdTelefono(), getIdProveedor(), getIndicadorPrincipal(), getIndicadorHabilitado());
    }
}
