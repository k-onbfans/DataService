package com.accenture.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "flight_info", schema = "integrated_system", catalog = "")
public class FlightInfoEntity {
    private int id;
    private String flightNumber;
    private String originPort;
    private String destinationPort;
    private String aircraft;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "flight_number")
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Basic
    @Column(name = "origin_port")
    public String getOriginPort() {
        return originPort;
    }

    public void setOriginPort(String originPort) {
        this.originPort = originPort;
    }

    @Basic
    @Column(name = "destination_port")
    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    @Basic
    @Column(name = "aircraft")
    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightInfoEntity that = (FlightInfoEntity) o;

        if (id != that.id) return false;
        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        if (originPort != null ? !originPort.equals(that.originPort) : that.originPort != null) return false;
        if (destinationPort != null ? !destinationPort.equals(that.destinationPort) : that.destinationPort != null)
            return false;
        if (aircraft != null ? !aircraft.equals(that.aircraft) : that.aircraft != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (originPort != null ? originPort.hashCode() : 0);
        result = 31 * result + (destinationPort != null ? destinationPort.hashCode() : 0);
        result = 31 * result + (aircraft != null ? aircraft.hashCode() : 0);
        return result;
    }
}
