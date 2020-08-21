package com.TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/com/feature/Login.feature"},
		glue= {"com.stepdef"}, monochrome=true,
		plugin= {"pretty","html:target/cucumber-report"}
		
		)
public class Runner {

	
}	
