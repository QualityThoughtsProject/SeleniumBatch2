package com.qt.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class DeskTopPage {

	WebDriver driver;

	@FindBy(xpath = "//a[text()='Desktops']")
	WebElement desktopsLnk;
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	WebElement showAllDesktopsOptionLnk;
	@FindBy(xpath = "//a[text()='Mac (1)']")
	WebElement macOption;
	@FindBy(xpath = "//a[text()='iMac']")
	WebElement macResult;

	public DeskTopPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickpOption(String option) {
		CommonMethods methods = new CommonMethods();
		if (option.equals("Desktops")) {
			methods.clickElement(desktopsLnk);
			methods.clickElement(macOption);
		} else {
			System.out.println("No option");
		}

	}

	public void verifyMacResults() {
		String macresult = macResult.getText();
		if (macresult.equals("iMac")) {
			System.out.println("Mac details found");
		} else {
			System.out.println("Mac details not found");
		}
	}

}
