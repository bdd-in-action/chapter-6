using NUnit.Framework;
using System;
using TechTalk.SpecFlow;

namespace FlyingHighSpecs
{
    [Binding]
    public class EarningFrequentFlyerPointsFromFlightsSteps
    {


        /*
         *     Given I am a <status> Frequent Flyer member
    When I fly on a flight that is worth <base> base points
    Then I should earn a status bonus of <bonus>
    And I should have guaranteed minimum earned points per trip of <minimum>
    And I should earn <total> points in all
         */
        [Given(@"the flying distance between (.*) and (.*) is (.*) km")]
        public void GivenTheFlyingDistanceBetweenSydneyAndMelbourneIsKm(string departure,
                                                                        string destination,
                                                                        int distance)
        {
           // TODO
        }
        

        [Given(@"I am a (.*) Frequent Flyer member")]
        public void GivenIAmAFrequentFlyerMemberOfStatus(string status)
        {
        }

        /*
        [Given]
        public void Given_I_am_a_STATUS_Frequent_Flyer_member(string status)
        {
            // TODO
        }
        */
        
        [When(@"I fly from (.*) to (.*)")]
        public void WhenIFlyBetween(string departure, string destination)
        {
        }
        
        [Then(@"I should earn (.*) points")]
        public void ThenIShouldEarnPoints(int points)
        {
        }
    }
}
