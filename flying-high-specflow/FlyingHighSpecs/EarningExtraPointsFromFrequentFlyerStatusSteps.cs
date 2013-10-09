using System;
using TechTalk.SpecFlow;

namespace FlyingHighSpecs
{
    [Binding]
    public class EarningExtraPointsFromFrequentFlyerStatusSteps
    {
        [When(@"I fly on a flight that is worth (.*) base points")]
        public void WhenIFlyOnAFlightThatIsWorthBasePoints(int p0)
        {
         //   ScenarioContext.Current.Pending();
        }
        
        [Then(@"I should earn a status bonus of (.*)")]
        public void ThenIShouldEarnAStatusBonusOf(int p0)
        {
           // ScenarioContext.Current.Pending();
        }
        
        [Then(@"I should have guaranteed minimum earned points per trip of (.*)")]
        public void ThenIShouldHaveGuaranteedMinimumEarnedPointsPerTripOf(int p0)
        {
            //ScenarioContext.Current.Pending();
        }

        public void foo(Table data) 
        {
               
        }
        
        [Then(@"I should earn (.*) points in all")]
        public void ThenIShouldEarnPointsInAll(int p0)
        {
            //ScenarioContext.Current.Pending();
        }
    }
}
