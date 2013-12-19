Search previous bookings
Scenario: Search for previous bookings
Given I have travelled on the following flights:
  | flight | from      | to        | date       |
  | FH-603 | Sydney    | Cairns    | 01-05-2012 |
  | FH-604 | Cairns    | Sydney    | 05-05-2012 |
  | FH-603 | Sydney    | Melbourne | 01-07-2012 |
  | FH-604 | Melbourne | Sydney    | 02-07-2012 |
  | FH-603 | Sydney    | Brisbane  | 28-07-2012 |
  | FH-604 | Brisbane  | Sydney    | 02-08-2012 |
When I search my bookings:
  {transformer=FROM_LANDSCAPE}
  | Earliest Date | 01-07-2012 |
  | Latest Date   | 31-07-2012 |
  | Departure     | Sydney     |
Then I should see the following flights:
  | flight | from   | to        | date       |
  | FH-603 | Sydney | Melbourne | 01-07-2012 |
  | FH-603 | Sydney | Brisbane  | 28-07-2012 |
