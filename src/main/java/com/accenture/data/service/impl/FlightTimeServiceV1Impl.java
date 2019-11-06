package com.accenture.data.service.impl;

import com.accenture.data.entity.FlightTimeEntity;
import com.accenture.data.repository.FlightTimeRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.bean.DepAndArrTime;
import com.accenture.data.response.v1.FindFlightTimeRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accenture.data.service.FlightTimeServiceV1;

@Service
public class FlightTimeServiceV1Impl implements FlightTimeServiceV1 {

    private static final Logger logger = LoggerFactory.getLogger(FlightInfoServiceV1Impl.class);


    @Autowired
    private FlightTimeRepository flightTimeRepository;

    @Override
    public FindFlightTimeRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq request) {
        try {

            Thread.sleep(3000+(long)(Math.random()*7000));
        }catch (InterruptedException e){
            logger.error("catch InterruptedException");
        }
        FlightTimeEntity flightTimeEntity = flightTimeRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        FindFlightTimeRes findFlightTimeByFlightNumberRes = new FindFlightTimeRes();
        findFlightTimeByFlightNumberRes.setFlightNumber(flightTimeEntity.getFlightNumber());
        findFlightTimeByFlightNumberRes.setDepartureDate(flightTimeEntity.getDepartureDate());
        DepAndArrTime scheduledTime = new DepAndArrTime(flightTimeEntity.getScheduledDepartureTime(),flightTimeEntity.getScheduledArrivalTime());
        DepAndArrTime estimatedTime = new DepAndArrTime(flightTimeEntity.getEstimatedDepartureTime(),flightTimeEntity.getEstimatedArrivalTime());
        findFlightTimeByFlightNumberRes.setScheduledTime(scheduledTime);
        findFlightTimeByFlightNumberRes.setEstimatedTime(estimatedTime);
        return findFlightTimeByFlightNumberRes;
    }
}
