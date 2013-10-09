package com.bddinaction.chapter6.steps;

import com.bddinaction.chapter6.model.Account;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

import java.util.List;
import java.util.Map;

/**
 * A description goes here.
 * User: john
 * Date: 15/08/13
 * Time: 10:41 PM
 */
public class TransferPointsSteps {

    @Given("the following accounts: $accounts")
    public void givenTheFollowingAccounts(ExamplesTable accounts) {
        for(Map<String, String> account : accounts.getRows()) {
            String owner = account.get("owner");
//            int points = Integer.parseInt(account.get("points"));
//            int status = Integer.parseInt(account.get("status-points"));
            // Initialize test account for this frequent flyer
        }
    }

    @When("$giver transfers $points points to $receiver")
    public void transferPoints(String giver, int points, String receiver) {
        // Transfer points
    }


    @Then("the accounts should be the following: $accounts")
    public void accountsShouldBe(ExamplesTable accounts) {
        for(Map<String, String> account : accounts.getRows()) {
            String owner = account.get("owner");
//            int points = Integer.parseInt(account.get("points"));
//            int status = Integer.parseInt(account.get("status-points"));
        }
    }


}
