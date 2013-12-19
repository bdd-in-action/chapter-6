package com.bddinaction.chapter6.model;

import org.jbehave.core.annotations.AsParameters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@AsParameters
public class PastFlight {

    static final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    String flight;
    String from;
    String to;
    String date;

    public Flight getFlight() {
        return Flight.number(flight).from(from).to(to);
    }

    public Date getDate() throws ParseException {
        return formatter.parse(date);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PastFlight that = (PastFlight) o;

        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (flight != null ? !flight.equals(that.flight) : that.flight != null) return false;
        if (from != null ? !from.equals(that.from) : that.from != null) return false;
        if (to != null ? !to.equals(that.to) : that.to != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = flight != null ? flight.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PastFlight{" +
                "flight='" + flight + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
