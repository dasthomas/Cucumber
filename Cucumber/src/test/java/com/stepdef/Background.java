package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utilities.Elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class Background {
	WebDriver driver;
  
	@Given("^Open the Application$")
    public void open_the_application() throws Throwable {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Elements.URL);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(Elements.Search)).sendKeys("Wipro");
    }
	@Then("^Navigate to home screen$")
    public void navigate_to_home_screen() throws Throwable {
       System.out.println("not now ");
      
        
    }
	
}
