package com.prspringjv.prspringjvprueba2.persistence.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="localidad",schema = "geolocalizacion")
public class Localidad {
    @Id
    @Column(name="codigo_localidad")
    private Integer idLocalidad;
    @Column(name="descripcion_localidad")
    private String descLocalidad;
    @Column(name="poligono_localidad")
    private String polygonLocalidad;
    @Column(name="color_localidad")
    private String colorLocalidad;

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getDescLocalidad() {
        return descLocalidad;
    }

    public void setDescLocalidad(String descLocalidad) {
        this.descLocalidad = descLocalidad;
    }

    public String getPolygonLocalidad() {
        return polygonLocalidad;
    }

    public void setPolygonLocalidad(String polygonLocalidad) {
        this.polygonLocalidad = polygonLocalidad;
    }

    public String getColorLocalidad() {
        return colorLocalidad;
    }

    public void setColorLocalidad(String colorLocalidad) {
        this.colorLocalidad = colorLocalidad;
    }
}
