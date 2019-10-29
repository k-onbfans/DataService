package com.accenture.data.v1.service.impl;

import com.accenture.data.entity.FlightStatusEntity;
import com.accenture.data.repository.FlightStatusRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.v1.response.FindFlightStatusByFlightNumberRes;
import com.accenture.data.v1.service.FlightStatusServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightStatusServiceV1Impl implements FlightStatusServiceV1 {

    @Autowired
    private FlightStatusRepository flightStatusRepository;

    @Override
    public FindFlightStatusByFlightNumberRes findByFlightNumber(FindByFlightNumberAndDepartureDateReq request) {
        FlightStatusEntity flightStatusEntity = flightStatusRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        FindFlightStatusByFlightNumberRes findFlightStatusByFlightNumberRes = new FindFlightStatusByFlightNumberRes();
        findFlightStatusByFlightNumberRes.setDepartureDate(flightStatusEntity.getDepartureDate());
        findFlightStatusByFlightNumberRes.setFlightNumber(flightStatusEntity.getFlightNumber());
        findFlightStatusByFlightNumberRes.setStatus(flightStatusEntity.getStatus());
        return findFlightStatusByFlightNumberRes;
    }
}
