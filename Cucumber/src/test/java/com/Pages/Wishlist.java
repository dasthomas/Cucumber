package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
WebDriver driver;

public Wishlist(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[contains(text(),'Wishlist')]")
private WebElement wishlist;

@FindBy(xpath="//*[@class='_27LgAY']")
private WebElement delete;

@FindBy(xpath="//*[@class='TLVGit']")
private WebElement wishlistitems;

@FindBy(xpath="//button[contains(text(),'YES, REMOVE')]")
private WebElement confirm;

public void clickwishlist() throws InterruptedException {
	Thread.sleep(3000);
	wishlist.click();
}
public void deletewishlist() throws InterruptedException {
  
	for(int i=1;i<=10;i++) {
		Thread.sleep(2000);
		if(delete.isDisplayed()) {
			Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
		  confirm.click();
	}
	
}

}
}
