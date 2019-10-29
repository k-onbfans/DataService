package com.accenture.data.v1.controller;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.response.FindFlightStatusByFlightNumberRes;
import com.accenture.data.v1.service.FlightInfoServiceV1;
import com.accenture.data.v1.service.FlightStatusServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/flightstatus")
public class FlightStatusControllerV1 {

    @Autowired
    private FlightStatusServiceV1 flightStatusServiceV1;

    @PostMapping("/byflightnumber")
    public FindFlightStatusByFlightNumberRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq request){
        return flightStatusServiceV1.findByFlightNumber(request);
    }
}
