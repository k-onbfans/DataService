package com.accenture.data.repository;

import com.accenture.data.entity.FlightStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;

public interface FlightStatusRepository extends JpaRepository<FlightStatusEntity,Long> {

    FlightStatusEntity findByFlightNumberAndDepartureDate(String flightNumber,Date departureDate);
}
