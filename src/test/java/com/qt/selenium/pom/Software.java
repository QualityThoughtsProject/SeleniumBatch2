package com.qt.selenium.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class Software {
	
	WebDriver driver;
	@FindBy(xpath="//a[text()='Software']")
	WebElement SoftwareLnk;
	@FindBy(xpath="//p[text()='There are no products to list in this category.']")WebElement SoftwareResult1;
	
	public void SoftwareFeture(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public Software(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickSoftwareoption() {
		CommonMethods methods=new CommonMethods();
		methods.clickElement(SoftwareLnk);
}
}