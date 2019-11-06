package com.accenture.data.service.impl;

import com.accenture.data.entity.FlightStatusEntity;
import com.accenture.data.repository.FlightStatusRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.response.v1.FindFlightStatusRes;
import com.accenture.data.service.FlightStatusServiceV1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightStatusServiceV1Impl implements FlightStatusServiceV1 {

    private static final Logger logger = LoggerFactory.getLogger(FlightInfoServiceV1Impl.class);


    @Autowired
    private FlightStatusRepository flightStatusRepository;

    @Override
    public FindFlightStatusRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq request) {
        try {

            Thread.sleep(3000+(long)(Math.random()*7000));
        }catch (InterruptedException e){
            logger.error("catch InterruptedException");
        }
        FlightStatusEntity flightStatusEntity = flightStatusRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        FindFlightStatusRes findFlightStatusByFlightNumberRes = new FindFlightStatusRes();
        findFlightStatusByFlightNumberRes.setDepartureDate(flightStatusEntity.getDepartureDate());
        findFlightStatusByFlightNumberRes.setFlightNumber(flightStatusEntity.getFlightNumber());
        findFlightStatusByFlightNumberRes.setStatus(flightStatusEntity.getStatus());
        return findFlightStatusByFlightNumberRes;
    }
}
