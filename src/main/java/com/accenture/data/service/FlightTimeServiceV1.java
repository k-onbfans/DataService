package com.accenture.data.service;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.response.v1.FindFlightTimeRes;

public interface FlightTimeServiceV1 {

    public FindFlightTimeRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq) throws InterruptedException;

}
