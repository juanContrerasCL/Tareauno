package com.prspringjv.prspringjvprueba2.persistence.mapper;

import com.prspringjv.prspringjvprueba2.domain.dto.Location;
import com.prspringjv.prspringjvprueba2.persistence.entity.Localidad;
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
public class LocationMapperImpl implements LocationMapper {

    @Override
    public Location toLocation(Localidad localidad) {
        if ( localidad == null ) {
            return null;
        }

        Location location = new Location();

        location.setLocalidadId( localidad.getIdLocalidad() );
        location.setDescripcionId( localidad.getDescLocalidad() );
        location.setPoligonoId( localidad.getPolygonLocalidad() );
        location.setColorId( localidad.getColorLocalidad() );

        return location;
    }

    @Override
    public List<Location> toLocations(List<Localidad> localidades) {
        if ( localidades == null ) {
            return null;
        }

        List<Location> list = new ArrayList<Location>( localidades.size() );
        for ( Localidad localidad : localidades ) {
            list.add( toLocation( localidad ) );
        }

        return list;
    }

    @Override
    public Localidad toLocalidad(Location locations) {
        if ( locations == null ) {
            return null;
        }

        Localidad localidad = new Localidad();

        localidad.setIdLocalidad( locations.getLocalidadId() );
        localidad.setDescLocalidad( locations.getDescripcionId() );
        localidad.setPolygonLocalidad( locations.getPoligonoId() );
        localidad.setColorLocalidad( locations.getColorId() );

        return localidad;
    }
}
