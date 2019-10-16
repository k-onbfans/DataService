package com.accenture.data.request;


import java.sql.Date;


public class FindByFlightNumberAndDepartureDateReq {
    private String flightNumber;

    private Date departureDate;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
}
