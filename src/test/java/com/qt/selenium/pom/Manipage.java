package com.qt.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manipage {

	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Desktop']")
	WebElement Desktopslink;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	WebElement LaptopsNotbookslink;
	@FindBy(xpath = "//a[text()='Components']")
	WebElement Componentslink;
	@FindBy(xpath = "//a[text()='Tablets']")
	WebElement tabletslnk;
	@FindBy(xpath = "//a[text()='Softwere']")
	WebElement softwerelnk;
	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	WebElement PhonesAndpdalnk;
	@FindBy(xpath = "//a[test()='Cameras']")
	WebElement cameraslnk;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	WebElement MP3playerslnk;

	
public Manipage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}


