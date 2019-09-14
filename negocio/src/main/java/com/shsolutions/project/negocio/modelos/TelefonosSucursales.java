package com.shsolutions.project.negocio.modelos;

public class TelefonosSucursales {

    private Integer idTelefonoSucursal;
    private Integer idTelefono;
    private Integer idSucursal;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public Integer getIdTelefonoSucursal() {
        return idTelefonoSucursal;
    }

    public void setIdTelefonoSucursal(Integer idTelefonoSucursal) {
        this.idTelefonoSucursal = idTelefonoSucursal;
    }

    public Integer getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Integer idTelefono) {
        this.idTelefono = idTelefono;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Boolean getIndicadorPrincipal() {
        return indicadorPrincipal;
    }

    public void setIndicadorPrincipal(Boolean indicadorPrincipal) {
        this.indicadorPrincipal = indicadorPrincipal;
    }

    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }
}
