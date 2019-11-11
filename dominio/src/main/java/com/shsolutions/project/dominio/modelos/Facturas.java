package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "facturas", catalog = "shsolutions")
public class Facturas implements Serializable {

    private Integer idFactura;
    private Integer idVenta;
    private Integer idIva;
    private String factura;
    private Boolean indicadorHabilitado;

    public Facturas() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdFactura")
    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    @Basic
    @Column(name = "IdVenta")
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    @Basic
    @Column(name = "IdIva")
    public Integer getIdIva() {
        return idIva;
    }

    public void setIdIva(Integer idIva) {
        this.idIva = idIva;
    }

    @Basic
    @Column(name = "Factura")
    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
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
        Facturas facturas = (Facturas) o;
        return Objects.equals(getIdFactura(), facturas.getIdFactura()) &&
                Objects.equals(getIdVenta(), facturas.getIdVenta()) &&
                Objects.equals(getIdIva(), facturas.getIdIva()) &&
                Objects.equals(getIndicadorHabilitado(), facturas.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdFactura(), getIdVenta(), getIdIva(), getIndicadorHabilitado());
    }
}