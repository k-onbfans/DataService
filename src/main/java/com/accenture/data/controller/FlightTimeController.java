package com.accenture.data.controller;

import com.accenture.data.entity.FlightTimeEntity;
import com.accenture.data.repository.FlightTimeRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight_time")
public class FlightTimeController {

    @Autowired
    private FlightTimeRepository flightTimeRepository;

    @PostMapping("/findall")
    public List<FlightTimeEntity> findAll(){
        return flightTimeRepository.findAll();
    }

    @PostMapping("/findbyflightnumberanddeparturedate")
    public FlightTimeEntity findByFlightNumberAndDepartureDate(@RequestBody FindByFlightNumberAndDepartureDateReq request){
        FlightTimeEntity flightTimeEntity = flightTimeRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        return flightTimeEntity;
    }
}
