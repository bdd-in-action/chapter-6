package com.bddinaction.chapter6.steps;

import com.bddinaction.chapter6.model.Account;
import com.bddinaction.chapter6.steps.thucydides.TestDatabaseAPI;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import org.jbehave.core.steps.Parameters;

import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

/**
 * A description goes here.
 * User: john
 * Date: 15/08/13
 * Time: 10:41 PM
 */
public class TransferPointsSteps {

    TestDatabaseAPI inTheTestDatabase = new TestDatabaseAPI();

    @Given("the following accounts: $accounts")
    public void givenTheFollowingAccounts(ExamplesTable accounts) {
        for(Parameters account : accounts.getRowsAsParameters()) {
            String owner = account.valueAs("owner", String.class);
            int points = account.valueAs("points", Integer.class);
            int statusPoints = account.valueAs("status-points", Integer.class);

            inTheTestDatabase.addAccount(Account.forMember(owner)
                                                .withPointBalance(points)
                                                .withStatusPoints(statusPoints));
        }
    }

    @When("$giver transfers $points points to $receiver")
    public void transferPoints(String giver, int points, String receiver) {
        // Transfer points
    }


    @Then("the accounts should be the following: $accounts")
    public void accountsShouldBe(ExamplesTable accounts) {
    }


}
