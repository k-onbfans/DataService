package com.accenture.data.repository;

import com.accenture.data.entity.FlightTimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface FlightTimeRepository extends JpaRepository<FlightTimeEntity,Long> {

    FlightTimeEntity findByFlightNumberAndDepartureDate (String flightNumber,Date departureDate);
}
