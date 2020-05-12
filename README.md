# Overview

This is a simple poc using [Cucumber](https://cucumber.io/).

# Cucumber Concepts

Gherkin uses a set of special keywords to give structure and meaning to executable specifications. 
Each keyword is translated to many spoken languages; in this reference we’ll use English.

## Feature

The purpose of the Feature keyword is to provide a high-level description of a software feature, 
and to group related scenarios.

## Rule (Optional)

The purpose of the Rule keyword is to represent one business rule that should be implemented. 
It provides additional information for a feature. A Rule is used to group together several scenarios 
that belong to this business rule. A Rule should contain one or more scenarios that illustrate the 
particular rule.

## Background (Optional)

Occasionally you’ll find yourself repeating the same Given steps in all of the scenarios in a Feature.

Since it is repeated in every scenario, this is an indication that those steps are not essential to 
describe the scenarios; they are incidental details. You can literally move such Given steps to the 
background, by grouping them under a Background section.

## Scenario


#### Given

Given steps are used to describe the initial context of the system - the scene of the scenario. 
It is typically something that happened in the past.

#### When

When steps are used to describe an event, or an action. This can be a person interacting with the 
system, or it can be an event triggered by another system.

#### Then

Then steps are used to describe an expected outcome, or result.

#### And & But

If you have successive Given’s, When’s, or Then’s, you could write:

```
Example: Multiple Givens
  Given one thing
  And another thing
  And yet another thing
  When I open my eyes
  Then I should see something
  But I shouldn't see something else
```

# Example

```
Feature: Overdue tasks
  Let users know when tasks are overdue, even when using other
  features of the app

  Rule: Users are notified about overdue tasks on first use of the day
    Background:
      Given I have overdue tasks

    Example: First use of the day
      Given I last used the app yesterday
      When I use the app
      Then I am notified about overdue tasks

    Example: Already used today
      Given I last used the app earlier today
      When I use the app
      Then I am not notified about overdue tasks
```

# [Reference](https://cucumber.io/docs/gherkin/reference/)

# Be Happy