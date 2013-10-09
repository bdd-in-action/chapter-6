package com.bddinaction.chapter6.steps.thucydides;

import com.bddinaction.chapter6.model.Trip;
import net.thucydides.core.annotations.Step;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/**
 * A description goes here.
 * User: john
 * Date: 15/08/13
 * Time: 3:29 PM
 */
public class TripSteps {

    @Step("Lookup trip from 0 to {1} leaving at {3} on {2}")
    public Trip lookupTrip(String departure, String destination, LocalTime time, DateTime date) {
        return new Trip();
    }
}
