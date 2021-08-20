package com.prspringjv.prspringjvprueba2.persistence;

import com.prspringjv.prspringjvprueba2.domain.dto.Informacion;
import com.prspringjv.prspringjvprueba2.domain.repository.InformacionRepository;
import com.prspringjv.prspringjvprueba2.persistence.crud.CiudadanoCrudRepository;
import com.prspringjv.prspringjvprueba2.persistence.entity.Ciudadano;
import com.prspringjv.prspringjvprueba2.persistence.mapper.InformacionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CiudadanoRepository implements InformacionRepository {

    @Autowired
    private CiudadanoCrudRepository CiudadanoCrudRepository;
    @Autowired
    private InformacionMapper Mapper;

    @Override
    public List<Informacion> getAll() {
        List<Ciudadano> ciudadanos=(List<Ciudadano>) CiudadanoCrudRepository.findAll();
        return Mapper.toInformacions(ciudadanos);
    }

    @Override
    public Optional<Informacion> getInformacion(int informacionId) {
        return CiudadanoCrudRepository.findById(informacionId).map(ciudadano -> Mapper.toInformacion(ciudadano));
    }


}
