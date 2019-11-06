package com.accenture.data.service;

import com.accenture.data.bean.Port;
import com.accenture.data.response.v1.FindFlightInfoRes;
import com.accenture.data.response.v1.FindFlightInfosRes;

public interface FlightInfoServiceV1 {

    public FindFlightInfoRes FindByFlightNumber(String flightNumber);

    public FindFlightInfosRes findFlightInfosByPort(Port port);
}
