package com.accenture.data.controller.v1;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.response.v1.FindFlightTimeRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accenture.data.service.FlightTimeServiceV1;

@RestController
@RequestMapping("/v1/flighttime")
public class FlightTimeControllerV1 {

    @Autowired
    private FlightTimeServiceV1 flightTimeServiceV1;

    @PostMapping("/byflightnumber")
    public FindFlightTimeRes findByFlightNumber (@RequestBody FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq) throws InterruptedException {
        return flightTimeServiceV1.findByFlightNumber(findByFlightNumberAndDepartureDateReq);
    }
}
