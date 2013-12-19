package com.bddinaction.chapter6.model;

//import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Flight {

    private String flightNumber;
    private String departure;
    private String destination;

    public Flight() {
    }

    public Flight(String flightNumber, String departure, String destination) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public static FlightBuilder number(String flightNumber) {
        return new FlightBuilder(flightNumber);
    }

    public static class FlightBuilder {
        String departure;
        String flightNumber;

        public FlightBuilder(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public FlightBuilder from(String departure) {
            this.departure = departure;
            return this;
        }

        public Flight to(String destination) {
            return new Flight(flightNumber, departure, destination);
        }
    }

}