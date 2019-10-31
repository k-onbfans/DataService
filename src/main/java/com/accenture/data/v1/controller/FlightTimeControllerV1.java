package com.accenture.data.v1.controller;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.response.FindFlightTimeRes;
import com.accenture.data.v1.service.FlightTimeServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/flighttime")
public class FlightTimeControllerV1 {

    @Autowired
    private FlightTimeServiceV1 flightTimeServiceV1;

    @PostMapping("/byflightnumber")
    public FindFlightTimeRes findByFlightNumber (@RequestBody FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq){
        return flightTimeServiceV1.findByFlightNumber(findByFlightNumberAndDepartureDateReq);
    }
}
