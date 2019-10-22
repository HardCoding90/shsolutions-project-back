package com.shsolutions.project.dominio.modelos;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "proveedores", catalog = "shsolutions")
public class Proveedores {

    private Integer idProveedor;
    private String razonSocial;
    private String nit;
    private String email;
    private LocalDate fechaRegistro;
    private Boolean indicadorHabilitado;

    public Proveedores() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdProveedor")
    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Basic
    @Column(name = "RazonSocial")
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "Nit")
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "FechaRegistro")
    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = LocalDate.now();
    }

    @Basic
    @Column(name = "IndicadorHabilitado")
    public Boolean getIndicadorHabilitado() {
        return indicadorHabilitado;
    }

    public void setIndicadorHabilitado(Boolean indicadorHabilitado) {
        this.indicadorHabilitado = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedores that = (Proveedores) o;
        return Objects.equals(getIdProveedor(), that.getIdProveedor()) &&
                Objects.equals(getRazonSocial(), that.getRazonSocial()) &&
                Objects.equals(getNit(), that.getNit()) &&
                Objects.equals(getEmail(), that.getEmail()) &&
                Objects.equals(getFechaRegistro(), that.getFechaRegistro()) &&
                Objects.equals(getIndicadorHabilitado(), that.getIndicadorHabilitado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdProveedor(), getRazonSocial(), getNit(), getEmail(), getFechaRegistro(), getIndicadorHabilitado());
    }
}
