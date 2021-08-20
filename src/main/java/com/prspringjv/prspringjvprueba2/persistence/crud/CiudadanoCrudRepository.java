package com.prspringjv.prspringjvprueba2.persistence.crud;

import com.prspringjv.prspringjvprueba2.persistence.entity.Ciudadano;
import org.springframework.data.repository.CrudRepository;

public interface CiudadanoCrudRepository extends CrudRepository <Ciudadano, Integer> {
}
