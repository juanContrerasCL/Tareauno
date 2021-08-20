package com.prspringjv.prspringjvprueba2.persistence.mapper;

import com.prspringjv.prspringjvprueba2.domain.dto.Informacion;
import com.prspringjv.prspringjvprueba2.persistence.entity.Ciudadano;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-20T09:22:59-0500",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.1.jar, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class InformacionMapperImpl implements InformacionMapper {

    @Override
    public Informacion toInformacion(Ciudadano ciudadano) {
        if ( ciudadano == null ) {
            return null;
        }

        Informacion informacion = new Informacion();

        informacion.setCiudadanoId( ciudadano.getIdCiudadano() );
        informacion.setNombre_unidadId( ciudadano.getUniCiudadano() );
        informacion.setNombre_gestorId( ciudadano.getNomCiudadano() );
        informacion.setEmail_gestorId( ciudadano.getEmailCiudadano() );
        informacion.setDireccion_unidadId( ciudadano.getDireccionCiudadano() );
        informacion.setCiudadId( ciudadano.getCiudadCiudadano() );
        informacion.setDepartamentoId( ciudadano.getDepartamentoCiudadano() );

        return informacion;
    }

    @Override
    public List<Informacion> toInformacions(List<Ciudadano> ciudadanos) {
        if ( ciudadanos == null ) {
            return null;
        }

        List<Informacion> list = new ArrayList<Informacion>( ciudadanos.size() );
        for ( Ciudadano ciudadano : ciudadanos ) {
            list.add( toInformacion( ciudadano ) );
        }

        return list;
    }

    @Override
    public Ciudadano toCiudadano(Informacion informacions) {
        if ( informacions == null ) {
            return null;
        }

        Ciudadano ciudadano = new Ciudadano();

        ciudadano.setIdCiudadano( informacions.getCiudadanoId() );
        ciudadano.setUniCiudadano( informacions.getNombre_unidadId() );
        ciudadano.setNomCiudadano( informacions.getNombre_gestorId() );
        ciudadano.setEmailCiudadano( informacions.getEmail_gestorId() );
        ciudadano.setDireccionCiudadano( informacions.getDireccion_unidadId() );
        ciudadano.setCiudadCiudadano( informacions.getCiudadId() );
        ciudadano.setDepartamentoCiudadano( informacions.getDepartamentoId() );

        return ciudadano;
    }
}
