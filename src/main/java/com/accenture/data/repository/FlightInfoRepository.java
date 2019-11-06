package com.accenture.data.repository;

import com.accenture.data.entity.FlightInfoEntity;
import com.accenture.data.response.FlightRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.util.List;

public interface FlightInfoRepository extends JpaRepository<FlightInfoEntity,Long> {
    FlightInfoEntity findById(Integer id);

    FlightInfoEntity findByFlightNumber(String flightNumber);


    List<FlightInfoEntity> findByOriginPortAndDestinationPort (String originPort,String destinationPort);
}

