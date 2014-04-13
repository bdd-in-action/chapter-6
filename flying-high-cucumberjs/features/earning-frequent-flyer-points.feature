Feature: Calculating earned Frequent Flyer points

Scenario: Earning standard domestic Frequent Flyer points
Given the distance between Sydney and Melbourne is 878 km		
And I am a standard Frequent Flyer member					
When I fly from Sydney to Melbourne					
Then I should earn 439 travel points					
And I should earn 40 status points						
