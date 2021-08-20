package com.prspringjv.prspringjvprueba2.domain.service;

import com.prspringjv.prspringjvprueba2.domain.dto.Informacion;
import com.prspringjv.prspringjvprueba2.domain.repository.InformacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InformacionService {

    @Autowired
    private InformacionRepository informacionRepository;

    public List<Informacion> getAll() {return informacionRepository.getAll();}

    public Optional<Informacion> getInformacion(int informacionId) {return informacionRepository.getInformacion(informacionId);}
}
