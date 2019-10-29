package com.accenture.data.v1.service.impl;

import com.accenture.data.entity.FlightInfoEntity;
import com.accenture.data.repository.FlightInfoRepository;
import com.accenture.data.v1.bean.Port;
import com.accenture.data.v1.response.FindFlightInfoByFlightNumberRes;
import com.accenture.data.v1.service.FlightInfoServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightInfoServiceV1Impl implements FlightInfoServiceV1 {

    @Autowired
    private FlightInfoRepository flightInfoRepository;

    @Override
    public FindFlightInfoByFlightNumberRes FindByFlightNumber(String flightNumber) {
        FlightInfoEntity flightInfoEntity = flightInfoRepository.findByFlightNumber(flightNumber);
        FindFlightInfoByFlightNumberRes findByFlightNumberRes = new FindFlightInfoByFlightNumberRes();
        findByFlightNumberRes.setAircraft(flightInfoEntity.getAircraft());
        findByFlightNumberRes.setFlightNumber(flightInfoEntity.getFlightNumber());
        Port port = new Port();
        port.setOrigin(flightInfoEntity.getOriginPort());
        port.setDestination(flightInfoEntity.getDestinationPort());
        findByFlightNumberRes.setPort(port);
        return findByFlightNumberRes;
    }
}
