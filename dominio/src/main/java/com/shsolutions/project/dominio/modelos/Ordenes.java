package com.shsolutions.project.dominio.modelos;

import com.shsolutions.project.dominio.configuracion.LocalDateTimeConverter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ordenes", catalog = "shsolutions")
public class Ordenes implements Serializable {

    private Integer idOrden;
    private Integer idSucursal;
    private LocalDateTime fechaOrden;
    private Boolean indicadorRecibida;
    private Boolean indicadorHabilitado;

    private List<OrdenesProductos> ordenesProductos = new ArrayList<>();

    public Ordenes() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdOrden")
    public Integer getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(Integer idOrden) {
        this.idOrden = idOrden;
    }

    @Basic
    @Column(name = "IdSucursal")
    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    @Basic
    @Convert(converter = LocalDateTimeConverter.class)
    @Column(name = "FechaOrden")
    public LocalDateTime getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(LocalDateTime fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    @Basic
    @Column(name = "IndicadorRecibida")
    public Boolean getIndicadorRecibida() {
        return indicadorRecibida;
    }

    public void setIndicadorRecibida(Boolean indicadorRecibida) {
        this.indicadorRecibida = indicadorRecibida;
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = indicadorHabilitado;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @Where(clause = "IndicadorHabilitado = true")
    @JoinColumn(name = "IdOrden",referencedColumnName = "IdOrden")
    public List<OrdenesProductos> getOrdenesProductos() {
        return ordenesProductos;
    }

    public void setOrdenesProductos(List<OrdenesProductos> ordenesProductos) {
        this.ordenesProductos = ordenesProductos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ordenes ordenes = (Ordenes) o;
        return Objects.equals(getIdOrden(), ordenes.getIdOrden()) &&
                Objects.equals(getIdSucursal(), ordenes.getIdSucursal()) &&
                Objects.equals(getFechaOrden(), ordenes.getFechaOrden()) &&
                Objects.equals(getIndicadorRecibida(), ordenes.getIndicadorRecibida()) &&
                Objects.equals(getIndicadorHabilitado(), ordenes.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdOrden(), getIdSucursal(), getFechaOrden(), getIndicadorRecibida(), getIndicadorHabilitado());
    }
}
