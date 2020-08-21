package com.stepdef;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Pages.LoginPage;
import com.Pages.TopMenu;
import com.Pages.Wishlist;
import com.utilities.Elements;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
public class LoginTest {
	
	WebDriver driver;
	LoginPage loginpage;
	TopMenu topmenu;
	Wishlist wishlist;

	@Given("^Login to the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void Login_to_the_application(String username,String Password) throws Throwable {
        System.out.println("step1");
        WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Elements.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginpage=new LoginPage(driver);
		//loginpage.clicklogin();
		loginpage.username(username);
		loginpage.password(Password);
		loginpage.loginbutton();
    }
    @Then("^Go to the wishlist page$")
    public void Go_to_wishlist_page() throws Throwable {
       topmenu=new TopMenu(driver);
       topmenu.clickusername();
    }

    @And("^find the all wishlist items$")
    public void find_the_all_wishlist_items() throws Throwable {
        wishlist=new Wishlist(driver);
        wishlist.clickwishlist();
        wishlist.deletewishlist();
        
    }

    
}
