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

//    @Query(value="select i.flight_number as flightNumber,i.origin_port as originPort,i.destination_port as destinationPort,i.aircraft," +
//            "s.departure_date as departureDate,s.status," +
//            "t.scheduled_departure_time as scheduledDepartureTime,t.scheduled_arrival_time as scheduledArrivalTime,t.estimated_departure_time as estimatedDepartureTime,t.estimated_arrival_time as estimatedArrivalTime " +
//            "from flight_info i,flight_status s,flight_time t " +
//            "where i.flight_number = s.flight_number and s.flight_number = t.flight_number " +
//            "and i.origin_port = :originPort " +
//            "and i.destination_port = :destinationPort " +
//            "and s.departure_date = :departureDate ",nativeQuery = true)
//    List<FlightRes> search(String originPort, String destinationPort, Date departureDate);

    List<FlightInfoEntity> findByOriginPortAndDestinationPort (String originPort,String destinationPort);
}

