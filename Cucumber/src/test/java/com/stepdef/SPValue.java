package com.stepdef;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class SPValue {  
	   

	    @Given("^When the market is closed$")
	    public void when_the_market_is_closed() throws Throwable {
	       System.out.println("Market open");
	    }

	    @When("^User navigated to home screen$")
	    public void user_navigated_to_home_screen() throws Throwable {
	        System.out.println("step included");
	    }

	   

	    @Then("^User need to check the closed value$")
	    public void user_need_to_check_the_closed_value() throws Throwable {
	    System.out.println("Step 4");
	    }
	}


