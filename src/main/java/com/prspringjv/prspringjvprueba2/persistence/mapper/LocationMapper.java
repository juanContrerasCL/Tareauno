package com.prspringjv.prspringjvprueba2.persistence.mapper;


import com.prspringjv.prspringjvprueba2.domain.dto.Location;
import com.prspringjv.prspringjvprueba2.persistence.entity.Localidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    @Mappings(
            {
            @Mapping(source = "idLocalidad", target = "localidadId"),
            @Mapping(source = "descLocalidad", target = "descripcionId"),
            @Mapping(source = "polygonLocalidad", target = "poligonoId"),
            @Mapping(source = "colorLocalidad", target = "colorId"),
            }
    )
    Location toLocation(Localidad localidad);
    List<Location> toLocations(List<Localidad> localidades);

    @InheritInverseConfiguration
    Localidad toLocalidad(Location locations);

}
