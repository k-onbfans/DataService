package com.accenture.data.v1.service;

import com.accenture.data.v1.bean.Port;
import com.accenture.data.v1.response.FindFlightInfoRes;
import com.accenture.data.v1.response.FindFlightInfosRes;

public interface FlightInfoServiceV1 {

    public FindFlightInfoRes FindByFlightNumber(String flightNumber);

    public FindFlightInfosRes findFlightInfosByPort(Port port);
}
