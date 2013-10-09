package com.bddinaction.chapter6.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;

public class EarningPointsFromFlights {
    @Given("^the (flying|travelling) distance between (.*) and (.*) is (\\d+) km$")
    public void define_flying_distance(String flightMode,
                                       String departure,
                                       String destination,
                                       int distance) {
    }

    @When("^I fly from (.*) to (.*) on (.*)$")
    public void I_fly_from(String departure, String destination, Date date) throws Throwable {
    }

    @Then("^I should earn (\\d+) points$")
    public void I_should_earn_points(int points) throws Throwable {
        Assert.assertThat(points, is(points));
    }

    @Then("^I should earn a status bonus of <bonus>$")
    public void I_should_earn_a_status_bonus_of_bonus() throws Throwable {
    }

    @When("^I fly on a flight that is worth <base> base points$")
    public void I_fly_on_a_flight_that_is_worth_base_base_points() throws Throwable {
    }

//    @Given("^I am a Standard Frequent Flyer member$")
//    public void I_am_a_Standard_Frequent_Flyer_member() throws Throwable {
//        // Express the Regexp above with the code you wish you had
//    }

    @When("^I fly on a flight that is worth (\\d+) base points$")
    public void I_fly_on_a_flight_that_is_worth_base_points(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
    }

    @Then("^I should earn a status bonus of (\\d+)$")
    public void I_should_earn_a_status_bonus_of(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
    }

    @Then("^I should have guaranteed minimum earned points per trip of (\\d+)$")
    public void I_should_have_guaranteed_minimum_earned_points_per_trip_of(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
    }

    @Then("^I should earn (\\d+) points in all$")
    public void I_should_earn_points_in_all(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
    }

}
