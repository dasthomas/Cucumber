package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className="_3Ep39l")
	private WebElement Login;
	
	@FindBy(xpath= "//*[@class='_2zrpKA _1dBPDZ']")
	private WebElement Username;
	
	@FindBy(xpath="//*[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement password;
	
	@FindBy(xpath="//*[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement loginbutton;
	
	public void username(String name) {
		Username.sendKeys(name);
	}
	
	public void loginbutton() {
		loginbutton.click();
	}
	public void password(String passwordforlogin) {
		password.sendKeys(passwordforlogin);
	}
	
	public void clicklogin() {
		Login.click();
	}
	
	
}
