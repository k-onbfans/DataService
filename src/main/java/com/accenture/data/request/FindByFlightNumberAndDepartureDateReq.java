package com.accenture.data.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Setter
@Getter
@ToString
public class FindByFlightNumberAndDepartureDateReq {
    private String flightNumber;

    private Date departureDate;
}
