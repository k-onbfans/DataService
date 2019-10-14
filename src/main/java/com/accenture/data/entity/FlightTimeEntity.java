package com.accenture.data.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "flight_time", schema = "integrated_system", catalog = "")
public class FlightTimeEntity {
    private int id;
    private String flightNumber;
    private Date departureDate;
    private String scheduledDepartureTime;
    private String scheduledArrivalTime;
    private String estimatedDepartureTime;
    private String estimatedArrivalTime;

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
    @Column(name = "departure_date")
    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    @Basic
    @Column(name = "scheduled_departure_time")
    public String getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    public void setScheduledDepartureTime(String scheduledDepartureTime) {
        this.scheduledDepartureTime = scheduledDepartureTime;
    }

    @Basic
    @Column(name = "scheduled_arrival_time")
    public String getScheduledArrivalTime() {
        return scheduledArrivalTime;
    }

    public void setScheduledArrivalTime(String scheduledArrivalTime) {
        this.scheduledArrivalTime = scheduledArrivalTime;
    }

    @Basic
    @Column(name = "estimated_departure_time")
    public String getEstimatedDepartureTime() {
        return estimatedDepartureTime;
    }

    public void setEstimatedDepartureTime(String estimatedDepartureTime) {
        this.estimatedDepartureTime = estimatedDepartureTime;
    }

    @Basic
    @Column(name = "estimated_arrival_time")
    public String getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    public void setEstimatedArrivalTime(String estimatedArrivalTime) {
        this.estimatedArrivalTime = estimatedArrivalTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightTimeEntity that = (FlightTimeEntity) o;

        if (id != that.id) return false;
        if (flightNumber != null ? !flightNumber.equals(that.flightNumber) : that.flightNumber != null) return false;
        if (departureDate != null ? !departureDate.equals(that.departureDate) : that.departureDate != null)
            return false;
        if (scheduledDepartureTime != null ? !scheduledDepartureTime.equals(that.scheduledDepartureTime) : that.scheduledDepartureTime != null)
            return false;
        if (scheduledArrivalTime != null ? !scheduledArrivalTime.equals(that.scheduledArrivalTime) : that.scheduledArrivalTime != null)
            return false;
        if (estimatedDepartureTime != null ? !estimatedDepartureTime.equals(that.estimatedDepartureTime) : that.estimatedDepartureTime != null)
            return false;
        if (estimatedArrivalTime != null ? !estimatedArrivalTime.equals(that.estimatedArrivalTime) : that.estimatedArrivalTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (flightNumber != null ? flightNumber.hashCode() : 0);
        result = 31 * result + (departureDate != null ? departureDate.hashCode() : 0);
        result = 31 * result + (scheduledDepartureTime != null ? scheduledDepartureTime.hashCode() : 0);
        result = 31 * result + (scheduledArrivalTime != null ? scheduledArrivalTime.hashCode() : 0);
        result = 31 * result + (estimatedDepartureTime != null ? estimatedDepartureTime.hashCode() : 0);
        result = 31 * result + (estimatedArrivalTime != null ? estimatedArrivalTime.hashCode() : 0);
        return result;
    }
}
