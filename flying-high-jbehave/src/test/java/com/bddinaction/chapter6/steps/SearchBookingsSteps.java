package com.bddinaction.chapter6.steps;

import com.bddinaction.chapter6.model.Flight;
import com.bddinaction.chapter6.model.FrequentFlyerMember;
import com.bddinaction.chapter6.model.Members;
import com.bddinaction.chapter6.model.PastFlight;
import com.google.common.collect.Lists;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class SearchBookingsSteps {

    FrequentFlyerMember member = Members.getMember().withStatus("Gold");
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    @Given("I have travelled on the following flights: $flights")
    public void travelled_on_flights(ExamplesTable flights) throws ParseException {

        for(Map<String,String> flightDetails : flights.getRows()) {
            Flight flight = flightFromMap(flightDetails);

            Date date = dateFormat.parse(flightDetails.get("date"));
            member.flewOnFlight(flight).on(date);
        }
    }

    List<PastFlight> foundPastFlights;

    @When("I search my bookings: $searchCriteria")
    public void search_bookings(ExamplesTable searchCriteria) {
        //TODO: foundPastFlights = loadPassedFlightsMatching(searchCriteria);
    }

    @Then("I should see the following flights: $expectedFlights")
    public void thenIShouldSeeTheFollowingFlights(ExamplesTable flights) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        List<Flight> expectedFlights = Lists.newArrayList();
        for(Map<String,String> flightDetails : flights.getRows()) {
            expectedFlights.add(flightFromMap(flightDetails));
        }
        //TODO: assertThat(foundPastFlights).containsExactly(expectedFlights);
    }

    private Flight flightFromMap(Map<String, String> flightDetails) {
        return Flight.number(flightDetails.get("flight"))
                .from(flightDetails.get("from"))
                .to(flightDetails.get("to"));
    }

}
