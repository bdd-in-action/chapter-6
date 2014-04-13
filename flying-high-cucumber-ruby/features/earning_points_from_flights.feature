Feature: Earning Frequent Flyer points from flights
In order to encourage travellers to book with Flying High Airlines more frequently
As the Flying High sales manager
I want travellers to earn Frequent Flyer points when they fly with us

Scenario: Earning standard points from an Economy flight
Given the flying distance between Sydney and Melbourne is 878 km
And I am a standard Frequent Flyer member
When I fly from Sydney to Melbourne on 01/01/2013 at 09:00
Then I should earn 439 points

Scenario: Earning extra points on flights based on the cabine category
Given the flying distance between Sydney and Melbourne is 878 km
And I am a standard Frequent Flyer member
When I fly from Sydney to Melbourne in Business class
Then I should earn 878 points

Scenario: Earning extra points on flights based on frequent flyer status
Given the flying distance between Sydney and Melbourne is 878 km
And I am a Silver Frequent Flyer member
When I fly from Sydney to Melbourne on 01/01/2013 at 09:00
Then I should earn 439 points
And I should earn 200 member bonus points

Scenario: Earning extra points in a bonus flyer period
Given I am a standard Frequent Flyer member
And I am flying in 'Bonus Flyer' period
When I fly from Sydney to Melbourne on 01/01/2013 at 09:00
Then I should earn 439 points
And I should earn a status bonus of 400 points

Scenario: Earning points on partner flights
Given the flying distance between Sydney and Melbourne is 878 km
And I am a standard Frequent Flyer member
When I fly from Sydney to Melbourne on 01/01/2013 at 09:00
Then I should earn 439 points


Scenario: Registering
Given that I want to become a Frequent Flyer
When I register for the Frequent Flyer program
Then I should receive an email like this:
"""
Welcome to Frequent Flyer!
It's a really cool program
"""
And I should see my details on the Frequent Flyer home page