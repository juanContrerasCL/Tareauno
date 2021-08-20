package com.prspringjv.prspringjvprueba2.persistence.mapper;

import com.prspringjv.prspringjvprueba2.domain.dto.Informacion;
import com.prspringjv.prspringjvprueba2.persistence.entity.Ciudadano;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InformacionMapper {
    @Mappings(
            {

                    @Mapping(source = "idCiudadano", target = "ciudadanoId"),
                    @Mapping(source = "uniCiudadano", target = "nombre_unidadId"),
                    @Mapping(source = "nomCiudadano", target = "nombre_gestorId"),
                    @Mapping(source = "emailCiudadano", target = "email_gestorId"),
                    @Mapping(source = "direccionCiudadano", target = "direccion_unidadId"),
                    @Mapping(source = "ciudadCiudadano", target = "ciudadId"),
                    @Mapping(source = "departamentoCiudadano", target = "departamentoId"),
            }
    )
    Informacion toInformacion(Ciudadano ciudadano);
    List<Informacion> toInformacions(List<Ciudadano> ciudadanos);

    @InheritInverseConfiguration
    Ciudadano toCiudadano(Informacion informacions);
}
