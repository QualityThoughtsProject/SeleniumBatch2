package com.qt.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class LapTopAndNoteBookPage {

	WebDriver driver;
	CommonMethods methods=new CommonMethods();
	
	@FindBy(xpath="//a[text()='Tablets']") WebElement tabletslnk;
	@FindBy(xpath = "//a[text()='Samsung Galaxy Tab 10.1']") WebElement sansung;
	
	public LapTopAndNoteBookPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickTabletsOption() {
		methods.clickElement(tabletslnk);
	}
	
	
	
}
