package com.qt.selenium.pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class Tablet {

	WebDriver driver;
	@FindBy(xpath="//a[text()='Tablets']")
	WebElement TabletsLnk;
	@FindBy(xpath="Samsung Galaxy Tab 10.1']")WebElement TabletsResult1;
	
	public void TabletsFeture(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		public Tablet(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
}
	public void clickTabletsoption() {
		CommonMethods methods=new CommonMethods();
		methods.clickElement(TabletsLnk);
		
}
}