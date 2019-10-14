package com.accenture.data.controller;

import com.accenture.data.entity.FlightStatusEntity;
import com.accenture.data.repository.FlightStatusRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight_status")
public class FlightStatusController {

    @Autowired
    private FlightStatusRepository flightStatusRepository;

    @PostMapping("/findall")
    public List<FlightStatusEntity> findAll(){
        return flightStatusRepository.findAll();
    }

    @PostMapping("/findbyflightnumberanddeparturedate")
    public FlightStatusEntity findByFlightNumberAndDepartureDate(@RequestBody FindByFlightNumberAndDepartureDateReq request){
        FlightStatusEntity flightStatusEntity = flightStatusRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        return flightStatusEntity;
    }
}
