package com.example.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.DayOfWeek;
import java.time.LocalDate;
import org.junit.Assert;

public class StepDefinitions {

  private DayOfWeek dayOfWeek;

  private String answer;

  @Given("Today is {string}")
  public void todayIs(String day) {
    this.dayOfWeek = DayOfWeek.valueOf(day.toUpperCase());
  }

  @When("I ask whether it's Friday yet")
  public void i_ask_whether_it_s_Friday_yet() {
    answer = DayOfWeek.FRIDAY.equals(dayOfWeek) ? "Yes" : "Nope";
  }

  @Then("I should be told {string}")
  public void i_should_be_told(String dayOfWeek) {
    Assert.assertEquals(answer, dayOfWeek);
  }

  @Given("I have to see the calendar")
  public void iHaveOverdueTasks() {
    System.out.println("Today is " + LocalDate.now().getDayOfWeek().name());
  }

}