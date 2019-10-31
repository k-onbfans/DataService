package com.accenture.data.v1.service;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.response.FindFlightStatusRes;

public interface FlightStatusServiceV1 {

    public FindFlightStatusRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq);

}
