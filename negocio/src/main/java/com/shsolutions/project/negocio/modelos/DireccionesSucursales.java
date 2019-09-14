package com.shsolutions.project.negocio.modelos;

public class DireccionesSucursales {

    private Integer idDireccionSucursal;
    private Integer idDireccion;
    private Integer idSucursal;
    private Boolean indicadorPrincipal;
    private Boolean indicadorHabilitado;

    public Integer getIdDireccionSucursal() {
        return idDireccionSucursal;
    }

    public void setIdDireccionSucursal(Integer idDireccionSucursal) {
        this.idDireccionSucursal = idDireccionSucursal;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
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
