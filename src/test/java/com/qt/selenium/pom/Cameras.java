package com.qt.selenium.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;


public class Cameras {
	
WebDriver driver;
	
	@FindBy(xpath="//a[text()='Cameras']")
	WebElement CamerasLnk;
	@FindBy(xpath="//span[@class=\"d-none d-xl-inline\"]")
	WebElement ShowAllproductcompareOptionLnk;
	@FindBy(xpath="//p[text()='You have not chosen any products to compare.']") WebElement CamerasResult1i;
	@FindBy(xpath="//a[text()='Canon EOS 5D']")WebElement CamerasResult1;
	@FindBy(xpath="//a[text()='Nikon D300']")WebElement CamerasResultl;

	public Cameras(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickCamerasopation() {
		CommonMethods methods=new CommonMethods();
		methods.clickElement(CamerasLnk);
}
	public void validateComponentProducts() {
		String option1=CamerasResult1i.getText();
		String option2=CamerasResult1.getText();
		if(option1.equals("Canon EOS 5D") && option2.equals("Nikon D300")) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
			Assert.fail();
		}
}
}