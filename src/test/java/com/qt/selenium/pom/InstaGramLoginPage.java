package com.qt.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class InstaGramLoginPage {
	
	WebDriver driver;
	@FindBy(xpath="//input[@aria-label='Phone number, username, or email']") WebElement username;
	@FindBy(xpath="//input[@aria-label='Password']") WebElement password;
	
	public InstaGramLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginTothePage(String userName,String pwd) {
		CommonMethods methods=new CommonMethods();
		methods.sendTextToElement(username, userName);
		methods.sendTextToElement(password, pwd);
	}

}
