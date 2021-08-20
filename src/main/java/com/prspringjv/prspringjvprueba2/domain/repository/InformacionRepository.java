package com.prspringjv.prspringjvprueba2.domain.repository;


import com.prspringjv.prspringjvprueba2.domain.dto.Informacion;

import java.util.List;
import java.util.Optional;

public interface InformacionRepository {

    List<Informacion> getAll();
    Optional<Informacion> getInformacion(int informacionId);
}
