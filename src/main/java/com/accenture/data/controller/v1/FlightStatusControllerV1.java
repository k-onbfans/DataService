package com.accenture.data.controller.v1;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.response.v1.FindFlightStatusRes;
import com.accenture.data.service.FlightStatusServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/flightstatus")
public class FlightStatusControllerV1 {

    @Autowired
    private FlightStatusServiceV1 flightStatusServiceV1;

    @PostMapping("/byflightnumber")
    public FindFlightStatusRes findByFlightNumber(@RequestBody FindByFlightNumberAndDepartureDateReq request) throws InterruptedException {
        return flightStatusServiceV1.findByFlightNumber(request);
    }
}
