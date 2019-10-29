package com.accenture.data.v1.service;

import com.accenture.data.v1.response.FindFlightInfoByFlightNumberRes;

public interface FlightInfoServiceV1 {

    public FindFlightInfoByFlightNumberRes FindByFlightNumber(String flightNumber);
}
