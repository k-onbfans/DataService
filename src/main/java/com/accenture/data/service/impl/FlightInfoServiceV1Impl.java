package com.accenture.data.service.impl;

import com.accenture.data.entity.FlightInfoEntity;
import com.accenture.data.repository.FlightInfoRepository;
import com.accenture.data.bean.Port;
import com.accenture.data.response.v1.FindFlightInfoRes;
import com.accenture.data.response.v1.FindFlightInfosRes;
import com.accenture.data.service.FlightInfoServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightInfoServiceV1Impl implements FlightInfoServiceV1 {

    @Autowired
    private FlightInfoRepository flightInfoRepository;

    @Override
    public FindFlightInfoRes findByFlightNumber(String flightNumber) {
        FlightInfoEntity flightInfoEntity = flightInfoRepository.findByFlightNumber(flightNumber);
        return flightInfoEntityToFindFlightInfoRes(flightInfoEntity);
    }

    @Override
    public FindFlightInfosRes findFlightInfosByPort(Port port) {
        List<FlightInfoEntity> list = flightInfoRepository.findByOriginPortAndDestinationPort(port.getOrigin(),port.getDestination());
        List<FindFlightInfoRes> result = new ArrayList<>();
        for (FlightInfoEntity entity:list) {
            result.add(flightInfoEntityToFindFlightInfoRes(entity));
        }
        return new FindFlightInfosRes(result);
    }

    public FindFlightInfoRes flightInfoEntityToFindFlightInfoRes(FlightInfoEntity flightInfoEntity) {
        FindFlightInfoRes findByFlightNumberRes = new FindFlightInfoRes();
        findByFlightNumberRes.setAircraft(flightInfoEntity.getAircraft());
        findByFlightNumberRes.setFlightNumber(flightInfoEntity.getFlightNumber());
        Port port = new Port();
        port.setOrigin(flightInfoEntity.getOriginPort());
        port.setDestination(flightInfoEntity.getDestinationPort());
        findByFlightNumberRes.setPort(port);
        return findByFlightNumberRes;
    }
}
