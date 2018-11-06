package com.airport.FlightsApp.persistance;

import javax.persistence.*;

/**
 * Created by Robi on 10/31/2018.
 */
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flight_id")
    private String flightId;
    @Column(name = "airplane_type")
    private String airplaneType;
    @Column(name = "departure_city")
    private String departureCity;
    @Column(name = "departure_date_time")
    private String departureDateTime;
    @Column(name = "arrival_city")
    private String arrivalCity;
    @Column(name = "arrival_date_time")
    private String arrivalDateTime;

    public Flight() {
    }

    public Flight(Flight flight) {
        this.flightId = flight.getFlightId();
        this.airplaneType = flight.getAirplaneType();
        this.departureCity = flight.getDepartureCity();
        this.departureDateTime = flight.getDepartureDateTime();
        this.arrivalCity = flight.getArrivalCity();
        this.arrivalDateTime = flight.getArrivalDateTime();
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }
}
