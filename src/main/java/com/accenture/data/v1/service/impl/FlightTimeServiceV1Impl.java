package com.accenture.data.v1.service.impl;

import com.accenture.data.entity.FlightTimeEntity;
import com.accenture.data.repository.FlightTimeRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.bean.DepAndArrTime;
import com.accenture.data.v1.response.FindFlightTimeRes;
import com.accenture.data.v1.service.FlightTimeServiceV1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
