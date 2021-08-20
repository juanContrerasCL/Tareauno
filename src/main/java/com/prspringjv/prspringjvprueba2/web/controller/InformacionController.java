package com.prspringjv.prspringjvprueba2.web.controller;


import com.prspringjv.prspringjvprueba2.domain.dto.Informacion;
import com.prspringjv.prspringjvprueba2.domain.service.InformacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
/*import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ciudadanos")
public class InformacionController {
    @Autowired
    private InformacionService informacionService;

    @GetMapping("/all")
    public List<Informacion> getAll() {return informacionService.getAll();}

    @GetMapping("/{id}")
    public Optional<Informacion> getInformacion(@PathVariable("id") Integer informacionId){
        return informacionService.getInformacion(informacionId);
    }
}
