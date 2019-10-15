package com.accenture.data.controller;

import com.accenture.data.entity.FlightInfoEntity;
import com.accenture.data.entity.FlightStatusEntity;
import com.accenture.data.entity.FlightTimeEntity;
import com.accenture.data.repository.FlightInfoRepository;
import com.accenture.data.repository.FlightStatusRepository;
import com.accenture.data.repository.FlightTimeRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.request.FindByRouteReq;
import com.accenture.data.response.FlightRes;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private FlightInfoRepository flightInfoRepository;

    @Autowired
    private FlightStatusRepository flightStatusRepository;

    @Autowired
    private FlightTimeRepository flightTimeRepository;

    @PostMapping("/findbyflightnumberanddeparturedate")
    public FlightRes findByFlightNumberAndDepartureDate(@RequestBody FindByFlightNumberAndDepartureDateReq request){
        FlightInfoEntity flightInfoEntity = flightInfoRepository.findByFlightNumber(request.getFlightNumber());
        FlightStatusEntity flightStatusEntity = flightStatusRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        FlightTimeEntity flightTimeEntity = flightTimeRepository.findByFlightNumberAndDepartureDate(request.getFlightNumber(),request.getDepartureDate());
        FlightRes flightRes = new FlightRes();

        BeanUtils.copyProperties(flightInfoEntity,flightRes);
        BeanUtils.copyProperties(flightStatusEntity,flightRes);
        BeanUtils.copyProperties(flightTimeEntity,flightRes);
        return flightRes;
    }

}
