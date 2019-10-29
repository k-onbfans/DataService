package com.accenture.data.v1.service;

import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.response.FindFlightStatusByFlightNumberRes;
import com.accenture.data.v1.response.FindFlightTimeByFlightNumberRes;

public interface FlightStatusServiceV1 {

    public FindFlightStatusByFlightNumberRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq findByFlightNumberAndDepartureDateReq);

}
