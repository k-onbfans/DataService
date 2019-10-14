package com.accenture.data.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class FlightRes {
    private String flightNumber;
    private String originPort;
    private String destinationPort;
    private String aircraft;
    private Date departureDate;
    private String status;
    private String scheduledDepartureTime;
    private String scheduledArrivalTime;
    private String estimatedDepartureTime;
    private String estimatedArrivalTime;
}
