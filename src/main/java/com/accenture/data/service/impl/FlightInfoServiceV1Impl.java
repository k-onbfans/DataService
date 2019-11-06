package com.accenture.data.service.impl;

import com.accenture.data.entity.FlightInfoEntity;
import com.accenture.data.repository.FlightInfoRepository;
import com.accenture.data.bean.Port;
import com.accenture.data.response.v1.FindFlightInfoRes;
import com.accenture.data.response.v1.FindFlightInfosRes;
import com.accenture.data.service.FlightInfoServiceV1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightInfoServiceV1Impl implements FlightInfoServiceV1 {

    private static final Logger logger = LoggerFactory.getLogger(FlightInfoServiceV1Impl.class);


    @Autowired
    private FlightInfoRepository flightInfoRepository;

    @Override
    public FindFlightInfoRes FindByFlightNumber(String flightNumber) {
        try {

            Thread.sleep(3000+(long)(Math.random()*7000));
        }catch (InterruptedException e){
            logger.error("catch InterruptedException");
        }
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

    public FindFlightInfoRes FlightInfoEntityToFindFlightInfoRes(FlightInfoEntity flightInfoEntity) {
        try {

            Thread.sleep(3000+(long)(Math.random()*7000));
        }catch (InterruptedException e){
            logger.error("catch InterruptedException");
        }
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
