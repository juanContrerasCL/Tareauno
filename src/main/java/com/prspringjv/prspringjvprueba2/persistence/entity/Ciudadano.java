package com.prspringjv.prspringjvprueba2.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadano",schema = "geolocalizacion")
public class Ciudadano {
    @Id
    @Column(name = "id_ciudadano")
    private Integer idCiudadano;
    @Column(name = "nombre_unidad_armda_nacional")
    private String uniCiudadano;
    @Column(name = "nombre_gestor")
    private String nomCiudadano;
    @Column(name = "email_gestor")
    private String emailCiudadano;
    @Column(name = "direccion_unidad")
    private String direccionCiudadano;
    @Column(name = "ciudad")
    private String ciudadCiudadano;
    @Column(name = "departamento")
    private String departamentoCiudadano;


    public Integer getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(Integer idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public String getUniCiudadano() {
        return uniCiudadano;
    }

    public void setUniCiudadano(String uniCiudadano) {
        this.uniCiudadano = uniCiudadano;
    }

    public String getNomCiudadano() {
        return nomCiudadano;
    }

    public void setNomCiudadano(String nomCiudadano) {
        this.nomCiudadano = nomCiudadano;
    }

    public String getEmailCiudadano() {
        return emailCiudadano;
    }

    public void setEmailCiudadano(String emailCiudadano) {
        this.emailCiudadano = emailCiudadano;
    }

    public String getDireccionCiudadano() {
        return direccionCiudadano;
    }

    public void setDireccionCiudadano(String direccionCiudadano) {
        this.direccionCiudadano = direccionCiudadano;
    }

    public String getCiudadCiudadano() {
        return ciudadCiudadano;
    }

    public void setCiudadCiudadano(String ciudadCiudadano) {
        this.ciudadCiudadano = ciudadCiudadano;
    }

    public String getDepartamentoCiudadano() {
        return departamentoCiudadano;
    }

    public void setDepartamentoCiudadano(String departamentoCiudadano) {
        this.departamentoCiudadano = departamentoCiudadano;
    }
}
