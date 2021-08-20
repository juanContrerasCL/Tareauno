package com.prspringjv.prspringjvprueba2.domain.repository;

import com.prspringjv.prspringjvprueba2.domain.dto.Location;

import java.util.List;
import java.util.Optional;

public interface LocationRepository {
    List<Location> getAll();
    Optional<Location> getLocalidad(int LocalidadId);
}
