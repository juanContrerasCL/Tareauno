package com.prspringjv.prspringjvprueba2.domain.service;

import com.prspringjv.prspringjvprueba2.domain.dto.Location;
import com.prspringjv.prspringjvprueba2.domain.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getALL() { return locationRepository.getAll(); }

    public Optional<Location> getLocation(int locationId) {return locationRepository.getLocalidad(locationId);}
}
