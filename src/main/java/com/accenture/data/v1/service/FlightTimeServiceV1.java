package com.accenture.data.v1.service;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.response.FindFlightTimeByFlightNumberRes;

public interface FlightTimeServiceV1 {

    public FindFlightTimeByFlightNumberRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq);
}
