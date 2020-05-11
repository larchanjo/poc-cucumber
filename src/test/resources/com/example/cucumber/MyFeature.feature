Feature: It is friday

  Scenario: Sunday is not Friday
    Given Today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"