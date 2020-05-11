package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.DayOfWeek;
import org.junit.Assert;

public class StepDefinitions {

  private DayOfWeek dayOfWeek;

  private String answer;

  @Given("Today is Sunday")
  public void today_is_Sunday() {
    this.dayOfWeek = DayOfWeek.SUNDAY;
  }

  @When("I ask whether it's Friday yet")
  public void i_ask_whether_it_s_Friday_yet() {
    answer = DayOfWeek.FRIDAY.equals(dayOfWeek) ? "Yes" : "Nope";
  }

  @Then("I should be told {string}")
  public void i_should_be_told(String dayOfWeek) {
    Assert.assertEquals(answer, dayOfWeek);
  }

}