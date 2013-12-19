package com.bddinaction.chapter6.steps;

import com.bddinaction.chapter6.model.Flight;
import com.bddinaction.chapter6.model.FrequentFlyerMember;
import com.bddinaction.chapter6.model.Members;
import com.bddinaction.chapter6.model.PastFlight;
import com.beust.jcommander.internal.Lists;
import org.jbehave.core.annotations.AsParameters;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.model.OutcomesTable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.fest.assertions.Assertions.assertThat;

/**
 * A description goes here.
 * User: john
 * Date: 14/12/2013
 * Time: 10:31 PM
 */
public class SearchBookingsSteps {

    FrequentFlyerMember member = Members.getMember().withStatus("Gold");


//    @Given("I have travelled on the following flights: $flights")
//    public void travelled_on_flights(ExamplesTable flights) throws ParseException {
//        for(Map<String,String> flightDetails : flights.getRows()) {
//            Flight flight = Flight.number(flightDetails.get("flight"))
//                  .from(flightDetails.get("from"))
//                  .to(flightDetails.get("to"));
//
//            Date date = formatter.parse(flightDetails.get("date"));
//            member.flewOnFlight(flight).on(flightDetails.get("date"));
//        }
//    }


    @Given("I have travelled on the following flights: $flights")
    public void travelled_on_flights(List<PastFlight> flights) throws ParseException {
        for(PastFlight pastFlight : flights) {
            member.flewOnFlight(pastFlight.getFlight()).on(pastFlight.getDate());
        }
    }

    List<PastFlight> foundPastFlights;

    @When("I search my bookings: $searchCriteria")
    public void search_bookings(ExamplesTable searchCriteria) {
        //foundPastFlights = loadPassedFlightsMatching(searchCriteria);
    }

    @Then("I should see the following flights: $expectedFlights")
    public void thenIShouldSeeTheFollowingFlights(List<PastFlight> expectedFlights) {
        //assertThat(foundPastFlights).containsExactly(expectedFlights);
    }
}
