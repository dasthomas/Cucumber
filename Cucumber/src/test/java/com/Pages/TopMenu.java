package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {
WebDriver driver;

public TopMenu(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//*[contains(text(),'yesudas')]")
private WebElement username;
 public void clickusername() {
	 Actions act=new Actions(driver);
	 act.moveToElement(username).build().perform();
 }
	
}
