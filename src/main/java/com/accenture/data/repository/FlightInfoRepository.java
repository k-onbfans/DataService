package com.accenture.data.repository;

import com.accenture.data.entity.FlightInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightInfoRepository extends JpaRepository<FlightInfoEntity,Long> {
    FlightInfoEntity findById(Integer id);

    FlightInfoEntity findByFlightNumber(String flightNumber);


    List<FlightInfoEntity> findByOriginPortAndDestinationPort (String originPort,String destinationPort);
}

