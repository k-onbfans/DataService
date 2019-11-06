package com.accenture.data.response.v1;

import com.accenture.data.bean.DepAndArrTime;

import java.sql.Date;

public class FindFlightTimeRes {

    private String flightNumber;
    private Date departureDate;
    private DepAndArrTime scheduledTime;
    private DepAndArrTime estimatedTime;

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

    public DepAndArrTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(DepAndArrTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public DepAndArrTime getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(DepAndArrTime estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    @Override
    public String toString() {
        return "FindFlightTimeByFlightNumberRes{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureDate=" + departureDate +
                ", scheduledTime=" + scheduledTime +
                ", estimatedTime=" + estimatedTime +
                '}';
    }
}
