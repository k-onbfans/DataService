package com.accenture.data.controller.v1;

import com.accenture.data.bean.Port;
import com.accenture.data.response.v1.FindFlightInfoRes;
import com.accenture.data.response.v1.FindFlightInfosRes;
import com.accenture.data.service.FlightInfoServiceV1;
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
    public FindFlightInfosRes findFlightInfosByPort(@RequestBody Port port){
        return flightInfoServiceV1.findFlightInfosByPort(port);
    }
}
