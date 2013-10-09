Feature: Earning Frequent Flyer points from flights					
In order to encourage travellers to book with Flying High Airlines more frequently
As the Flying High sales manager					
I want travellers to earn Frequent Flyer points when they fly with us	
 
Scenario: Earning standard points from an Economy flight		
Given I am a Gold Frequent Flyer member
When I fly from Sydney to Melbourne
Then I should earn 800 points
