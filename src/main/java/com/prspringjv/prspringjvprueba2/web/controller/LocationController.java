package com.prspringjv.prspringjvprueba2.web.controller;

import com.prspringjv.prspringjvprueba2.domain.dto.Location;
import com.prspringjv.prspringjvprueba2.domain.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;*/

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping("/all")
    public List<Location> getAll(){
        return locationService.getALL();
    }

    @GetMapping("/{id}")
    public Optional<Location> getLocation(@PathVariable("id") Integer locationId){
        return locationService.getLocation(locationId);
    }
}
