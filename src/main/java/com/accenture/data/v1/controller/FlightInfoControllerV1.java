package com.accenture.data.v1.controller;

import com.accenture.data.v1.bean.Port;
import com.accenture.data.v1.response.FindFlightInfoRes;
import com.accenture.data.v1.response.FindFlightInfosRes;
import com.accenture.data.v1.service.FlightInfoServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/flightinfo")
public class FlightInfoControllerV1 {

    @Autowired
    private FlightInfoServiceV1 flightInfoServiceV1;

    @GetMapping("/flightnumber/{flightNumber}")
    public FindFlightInfoRes findByFlightNumber(@PathVariable("flightNumber") String flightNumber){
        return flightInfoServiceV1.FindByFlightNumber(flightNumber);
    }

    @PostMapping("/port")
    public FindFlightInfosRes FindFlightInfosByPort(@RequestBody Port port){
        return flightInfoServiceV1.findFlightInfosByPort(port);
    }
}
