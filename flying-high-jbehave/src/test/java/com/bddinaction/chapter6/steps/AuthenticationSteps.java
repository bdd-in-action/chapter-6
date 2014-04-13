package com.bddinaction.chapter6.jbehave.steps;

import net.thucydides.core.Thucydides;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * A description goes here.
 * User: john
 * Date: 1/08/13
 * Time: 3:35 PM
 */
public class AuthenticationSteps {

    @Given("Joe is a Frequent Flyer member")
    public void givenJoeIsAFrequentFlyerMember() {
        System.out.println("JOE IS A FREQUENT FLYER");
    }

    @Given("Joe has registered online with a password of 'secret'")
    public void givenJoeHasRegisteredOnlineWithAPasswordOfsecret() {
        // PENDING
    }

    @When("Joe logs on with password 'secret'")
    public void whenJoeLogsOnWithPasswordsecret() {
    }

    @Then("he should be given access to the site")
    public void thenHeShouldBeGivenAccessToTheSite() {
        // PENDING
    }

    @Given("the account has expired")
    public void givenTheAccountHasExpired() {
        // PENDING
    }

    @When("Joe logs on with password 'wrong'")
    public void whenJoeLogsOnWithPasswordwrong() {
        // PENDING
    }

    @Then("he should be informed that his account has expired")
    public void thenHeShouldBeInformedThatHisAccountHasExpired() {

        // PENDING
    }

    @Then("he should be invited to renew his account")
    public void thenHeShouldBeInvitedToRenewHisAccount() {
        // PENDING
    }
    @Then("he should be informed that his password was incorrect")
    public void thenHeShouldBeInformedThatHisPasswordWasIncorrect() {
        // PENDING
    }

}
