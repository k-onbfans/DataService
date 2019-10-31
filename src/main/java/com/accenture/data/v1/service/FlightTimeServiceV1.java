package com.accenture.data.v1.service;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.response.FindFlightTimeRes;

public interface FlightTimeServiceV1 {

    public FindFlightTimeRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq);
}
