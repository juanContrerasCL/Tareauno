package com.prspringjv.prspringjvprueba2.domain.dto;

public class Informacion {
    private Integer ciudadanoId;
    private String nombre_unidadId;
    private String nombre_gestorId;
    private String email_gestorId;
    private String direccion_unidadId;
    private String ciudadId;
    private String departamentoId;

    public Integer getCiudadanoId() {
        return ciudadanoId;
    }

    public void setCiudadanoId(Integer ciudadanoId) {
        this.ciudadanoId = ciudadanoId;
    }

    public String getNombre_unidadId() {
        return nombre_unidadId;
    }

    public void setNombre_unidadId(String nombre_unidadId) {
        this.nombre_unidadId = nombre_unidadId;
    }

    public String getNombre_gestorId() {
        return nombre_gestorId;
    }

    public void setNombre_gestorId(String nombre_gestorId) {
        this.nombre_gestorId = nombre_gestorId;
    }

    public String getEmail_gestorId() {
        return email_gestorId;
    }

    public void setEmail_gestorId(String email_gestorId) {
        this.email_gestorId = email_gestorId;
    }

    public String getDireccion_unidadId() {
        return direccion_unidadId;
    }

    public void setDireccion_unidadId(String direccion_unidadId) {
        this.direccion_unidadId = direccion_unidadId;
    }

    public String getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(String ciudadId) {
        this.ciudadId = ciudadId;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(String departamentoId) {
        this.departamentoId = departamentoId;
    }
}
