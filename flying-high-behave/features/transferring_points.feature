Feature: Transfer points to other members

  Background:
#    Given Joe is a Frequent Flyer member
    Given a Frequent Flyer member Joe has logged in
    And Jill is a Frequent Flyer member

  @transfers
  Scenario: Transfer points between existing members
    Given the following accounts:
      | owner | points | statusPoints  |
      | Jill  | 100000 | 800           |
      | Joe   | 50000  | 50            |
    And Joe logs in
    When Joe transfers 40000 points to Jill
    Then the accounts should be the following:
      | owner | points | statusPoints   |
      | Jill  | 140000 | 800            |
      | John  | 10000  | 50             |
