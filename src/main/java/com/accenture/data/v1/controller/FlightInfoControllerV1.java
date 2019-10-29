package com.accenture.data.v1.controller;

import com.accenture.data.v1.response.FindFlightInfoByFlightNumberRes;
import com.accenture.data.v1.service.FlightInfoServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/flightinfo")
public class FlightInfoControllerV1 {

    @Autowired
    private FlightInfoServiceV1 flightInfoServiceV1;

    @GetMapping("/flightnumber/{flightNumber}")
    public FindFlightInfoByFlightNumberRes findByFlightNumber(@PathVariable("flightNumber") String flightNumber){
        return flightInfoServiceV1.FindByFlightNumber(flightNumber);
    }
}
