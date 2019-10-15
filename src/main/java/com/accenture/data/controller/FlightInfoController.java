package com.accenture.data.controller;

import com.accenture.data.entity.FlightInfoEntity;
import com.accenture.data.repository.FlightInfoRepository;
import com.accenture.data.repository.FlightStatusRepository;
import com.accenture.data.repository.FlightTimeRepository;
import com.accenture.data.request.FindByFlightNumberAndDepartureDateReq;
import com.accenture.data.request.FindByIdReq;
import com.accenture.data.request.FindByRouteReq;
import com.accenture.data.response.FlightInfoListRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight_info")
public class FlightInfoController {

    @Autowired
    private FlightInfoRepository flightInfoRepository;

    @PostMapping("/findall")
    public List<FlightInfoEntity> findAll(){
        return flightInfoRepository.findAll();
    }

    @PostMapping("/findbyid")
    public FlightInfoEntity findById(@RequestBody FindByIdReq req){
        FlightInfoEntity flightInfoEntity = flightInfoRepository.findById(req.getId());
        return flightInfoEntity;
    }

    @PostMapping("/findbyflightnumberanddeparturedate")
    public FlightInfoEntity findByFlightNumberAndDepartureDate(@RequestBody FindByFlightNumberAndDepartureDateReq request){
        FlightInfoEntity flightInfoEntity = flightInfoRepository.findByFlightNumber(request.getFlightNumber());
        return flightInfoEntity;
    }

    @PostMapping("/findbyoriginportanddestinationport")
    public FlightInfoListRes findByOriginPortAndDestinationPort(@RequestBody FindByRouteReq request){
        List<FlightInfoEntity> list = flightInfoRepository.findByOriginPortAndDestinationPort(request.getOriginPort(),request.getDestinationPort());
        FlightInfoListRes flightInfoListRes = new FlightInfoListRes();
        flightInfoListRes.setList(list);
        return flightInfoListRes;
    }
}
