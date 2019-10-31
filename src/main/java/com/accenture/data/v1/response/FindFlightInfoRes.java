package com.accenture.data.v1.response;

import com.accenture.data.v1.bean.Port;

public class FindFlightInfoRes {
    private String flightNumber;
    private Port port;
    private String aircraft;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Port getPort() {
        return port;
    }

    public void setPort(Port port) {
        this.port = port;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "FindByFlightNumberReq{" +
                "flightNumber='" + flightNumber + '\'' +
                ", port=" + port +
                ", aircraft='" + aircraft + '\'' +
                '}';
    }
}
