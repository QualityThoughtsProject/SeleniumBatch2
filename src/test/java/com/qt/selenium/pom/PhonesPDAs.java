package com.qt.selenium.pom;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class PhonesPDAs {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Phones & PDAs']")
	WebElement PhonesPDAsLnk;
	@FindBy(xpath="//span[@class='d-none d-xl-inline']")
	WebElement ShowAllproductcompareOptionLnk;
	@FindBy(xpath="//p[text()='You have not chosen any products to compare.']") WebElement PhonesPDAsopation;
	@FindBy(xpath="//a[text()='HTC Touch HD']")WebElement PhonesPDAsResult1;
	@FindBy(xpath="//a[text()='iPhone']")WebElement PhonesPDAsResultl;
	@FindBy(xpath="//a[text()='Palm Treo Pro']")WebElement PhonesPDAsResulti;
	
	public PhonesPDAs(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickPhonesPDAsopation() {
		CommonMethods methods=new CommonMethods();
		methods.clickElement(PhonesPDAsLnk);
	}
	public void validateComponentProducts() {
		String option1=PhonesPDAsResult1.getText();
		String option2=PhonesPDAsResultl.getText();
		String option3=PhonesPDAsResulti.getText();
		if(option1.equals("HTC Touch HD") && option2.equals("iPhone") && option3.equals("Palm Treo Pro")) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
			Assert.fail();
		}
}
}


