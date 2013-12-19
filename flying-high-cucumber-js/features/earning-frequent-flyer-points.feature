Feature: Calculating earned Frequent Flyer points

Scenario: Earning standard domestic Frequent Flyer points
Given the distance between Sydney and Melbourne is 878 km		
And I am a standard Frequent Flyer member					
When I fly from Sydney to Melbourne					
Then I should earn 439 travel points

 Scenario: Earning standard points from an Economy flight
 Normal flights earn 1 point every 2 kilometers
    * the flying distance between Sydney and Melbourne is 878 km
    * I am a standard Frequent Flyer member
    * I fly from Sydney to Melbourne on 10/10/2014
    * I should earn 439 points
