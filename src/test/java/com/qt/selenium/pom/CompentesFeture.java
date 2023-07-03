package com.qt.selenium.pom;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class CompentesFeture {
	
	WebDriver driver;
	@FindBy(xpath="//a[text()='Components']")
	WebElement componentsLnk;
	@FindBy(xpath="//a[Text()='Show All Components']")
	WebElement ShowAllComponentsOptionLnk;
	@FindBy(xpath="//a[text()='Monitors (2)']")
	WebElement monitorsOption;
	@FindBy(xpath="//a[text()='Apple Cinema 30\"']") WebElement MonitorsResult1;
	@FindBy(xpath="//a[text()='Samsung SyncMaster 941BW']") WebElement MonitorsResult;
	
	public CompentesFeture(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickcomponentsoption() {
		CommonMethods methods=new CommonMethods();
		methods.clickElement(componentsLnk);
		methods.clickElement(monitorsOption);

	}
	
	public void validateComponentProducts() {
		String option1=MonitorsResult1.getText();
		String option2=MonitorsResult.getText();
		if(option1.equals("Apple Cinema 30\"") && option2.equals("Samsung SyncMaster 941BW")) {
			System.out.println("pass");
		}else {
			System.out.println("Fail");
			Assert.fail();
		}
	}

}
