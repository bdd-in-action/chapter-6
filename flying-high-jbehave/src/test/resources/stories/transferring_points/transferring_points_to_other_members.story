Transferring points to other members

Narrative:
In order to allow friends and family to benefit from my Frequent Flyer points
As a Frequent Flyer member
I want to be able to transfer some of my points to other Frequent Flyer members

Scenario: Transfer points between existing members
Given the following accounts:
  | owner | points | status-points  |
  | Jane  | 100,000 | 800           |
  | Joe   | 50,000  | 50            |
When Joe transfers 40000 points to Jane
Then the accounts should be the following:
  | owner | points | status-points   |
  | Jane  | 140,000 | 800            |
  | Joe   | 10,000  | 50             |