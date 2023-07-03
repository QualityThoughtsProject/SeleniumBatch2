package com.qt.selenium.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;
public class Desktops {
WebDriver driver;
	
	@FindBy(xpath="//a[text()='Desktops']")
	WebElement DesktopsLnk;
	@FindBy(xpath="//a[text()='Show All Desktops']")
	WebElement ShowAllDesktopsOptionLnk;
	@FindBy(xpath="//a[text()='PC (0)']") WebElement Pcopation;
	@FindBy(xpath="//p[text()='There are no products to list in this category.']")
	WebElement pcResulti;
	@FindBy(xpath="//a[text()='Mac (1)']")WebElement Macopation;
	@FindBy(xpath="//a[text()='iMac']")WebElement macResultl;
	
	public Desktops(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	public void clickDesktopsLnkoption() {
		CommonMethods methods=new CommonMethods();
		methods.clickElement(DesktopsLnk);
		methods.clickElement(ShowAllDesktopsOptionLnk);
		methods.clickElement(Pcopation);
		methods.clickElement(Macopation);
	}
	public void validateDesktopsProducts() {
		String option1=macResultl.getText();
		if(option1.equals("iMac")) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
			Assert.fail();
		}
	}

}