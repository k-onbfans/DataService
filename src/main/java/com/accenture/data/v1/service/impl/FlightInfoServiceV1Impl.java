package com.accenture.data.v1.service.impl;

import com.accenture.data.entity.FlightInfoEntity;
import com.accenture.data.repository.FlightInfoRepository;
import com.accenture.data.v1.bean.Port;
import com.accenture.data.v1.response.FindFlightInfoRes;
import com.accenture.data.v1.response.FindFlightInfosRes;
import com.accenture.data.v1.service.FlightInfoServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightInfoServiceV1Impl implements FlightInfoServiceV1 {

    @Autowired
    private FlightInfoRepository flightInfoRepository;

    @Override
    public FindFlightInfoRes FindByFlightNumber(String flightNumber) {
        FlightInfoEntity flightInfoEntity = flightInfoRepository.findByFlightNumber(flightNumber);
        return FlightInfoEntityToFindFlightInfoRes(flightInfoEntity);
    }

    @Override
    public FindFlightInfosRes findFlightInfosByPort(Port port) {
        List<FlightInfoEntity> list = flightInfoRepository.findByOriginPortAndDestinationPort(port.getOrigin(),port.getDestination());
        List<FindFlightInfoRes> result = new ArrayList<>();
        for (FlightInfoEntity entity:list) {
            result.add(FlightInfoEntityToFindFlightInfoRes(entity));
        }
        FindFlightInfosRes res = new FindFlightInfosRes(result);
        return res;
    }

    public FindFlightInfoRes FlightInfoEntityToFindFlightInfoRes(FlightInfoEntity flightInfoEntity){
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
