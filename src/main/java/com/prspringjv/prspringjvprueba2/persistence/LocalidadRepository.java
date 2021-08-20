package com.prspringjv.prspringjvprueba2.persistence;

import com.prspringjv.prspringjvprueba2.domain.dto.Location;
import com.prspringjv.prspringjvprueba2.domain.repository.LocationRepository;
import com.prspringjv.prspringjvprueba2.persistence.crud.LocalidadCrudRepository;
import com.prspringjv.prspringjvprueba2.persistence.entity.Localidad;
import com.prspringjv.prspringjvprueba2.persistence.mapper.LocationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocalidadRepository implements LocationRepository {
    @Autowired
    private LocalidadCrudRepository LocalidadCrudRepository;
    @Autowired
    private LocationMapper Mapper;

    @Override
    public List<Location> getAll(){
        List<Localidad> localidades=(List<Localidad>) LocalidadCrudRepository.findAll();
        return Mapper.toLocations(localidades);
    }
    @Override
    public Optional<Location> getLocalidad(int IdLocalidad){
        return LocalidadCrudRepository.findById(IdLocalidad).map(localidad -> Mapper.toLocation(localidad));
    }
}
