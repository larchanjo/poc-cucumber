Feature: It is friday

  Rule: Some rule

    Background:
      Given I have to see the calendar

    Scenario: Sunday is not Friday
      Given Today is "Sunday"
      When I ask whether it's Friday yet
      Then I should be told "Nope"

    Scenario: Saturday is not Friday
      Given Today is "Saturday"
      When I ask whether it's Friday yet
      Then I should be told "Nope"