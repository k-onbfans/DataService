package com.accenture.data.v1.service.impl;

import com.accenture.data.entity.FlightTimeEntity;
import com.accenture.data.repository.FlightTimeRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.bean.DepAndArrTime;
import com.accenture.data.v1.response.FindFlightTimeByFlightNumberRes;
import com.accenture.data.v1.service.FlightTimeServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightTimeServiceV1Impl implements FlightTimeServiceV1 {

    @Autowired
    private FlightTimeRepository flightTimeRepository;

    @Override
    public FindFlightTimeByFlightNumberRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq request) {
        FlightTimeEntity flightTimeEntity = flightTimeRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        FindFlightTimeByFlightNumberRes findFlightTimeByFlightNumberRes = new FindFlightTimeByFlightNumberRes();
        findFlightTimeByFlightNumberRes.setFlightNumber(flightTimeEntity.getFlightNumber());
        findFlightTimeByFlightNumberRes.setDepartureDate(flightTimeEntity.getDepartureDate());
        DepAndArrTime scheduledTime = new DepAndArrTime(flightTimeEntity.getScheduledDepartureTime(),flightTimeEntity.getScheduledArrivalTime());
        DepAndArrTime estimatedTime = new DepAndArrTime(flightTimeEntity.getEstimatedDepartureTime(),flightTimeEntity.getEstimatedArrivalTime());
        findFlightTimeByFlightNumberRes.setScheduledTime(scheduledTime);
        findFlightTimeByFlightNumberRes.setEstimatedTime(estimatedTime);
        return findFlightTimeByFlightNumberRes;
    }
}
