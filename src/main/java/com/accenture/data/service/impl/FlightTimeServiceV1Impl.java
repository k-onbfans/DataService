package com.accenture.data.service.impl;

import com.accenture.data.entity.FlightTimeEntity;
import com.accenture.data.repository.FlightTimeRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.bean.DepAndArrTime;
import com.accenture.data.response.v1.FindFlightTimeRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accenture.data.service.FlightTimeServiceV1;

@Service
public class FlightTimeServiceV1Impl implements FlightTimeServiceV1 {

    @Autowired
    private FlightTimeRepository flightTimeRepository;

    @Override
    public FindFlightTimeRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq request) throws InterruptedException {
//        Thread.sleep(3000 + (long)(Math.random()*7000));
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
