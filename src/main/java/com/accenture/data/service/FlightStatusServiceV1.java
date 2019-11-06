package com.accenture.data.service;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.response.v1.FindFlightStatusRes;

public interface FlightStatusServiceV1 {

    public FindFlightStatusRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq);

}
