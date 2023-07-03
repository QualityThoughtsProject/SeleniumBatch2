package com.qt.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qt.selenium.CommonMethods;

public class Mp3player {

	WebDriver driver;
	@FindBy(xpath = "//a[text()='MP3 Players']")
	WebElement Mp3playerLnk;
	@FindBy(xpath = "//a[text()='Show All MP3 Players']")
	WebElement ShowAllMp3playerOptionLnk;
	@FindBy(xpath = "//a[text()='test 11 (0)']")
	WebElement test11Option;
	@FindBy(xpath = "//a[text()='test 12 (0)']")
	WebElement test12Option;
	@FindBy(xpath = "//a[text()='test 15 (0)']")
	WebElement test15Option;
	@FindBy(xpath = "//a[text()='test 16 (0)']")
	WebElement test16Option;
	@FindBy(xpath = "//a[text()='test 17 (0)']")
	WebElement test17Option;
	@FindBy(xpath = "//a[text()='test 18 (0)']")
	WebElement test18Option;
	@FindBy(xpath = "//a[text()='test 19 (0)']")
	WebElement test19Option;
	@FindBy(xpath = "//a[text()='test 20 (0)']")
	WebElement test20Option;
	@FindBy(xpath = "//a[text()='test 21 (0)']")
	WebElement test21Option;
	@FindBy(xpath = "//a[text()='test 22 (0)']")
	WebElement test22Option;
	@FindBy(xpath = "//a[text()='test 23 (0)']")
	WebElement test23Option;
	@FindBy(xpath = "//a[text()='test 24 (0)']")
	WebElement test24Option;
	@FindBy(xpath = "//a[text()='test 4 (0)']")
	WebElement test4Option;
	@FindBy(xpath = "//a[text()='test 5 (0)']")
	WebElement test5Option;
	@FindBy(xpath = "//a[text()='test 6 (0)']")
	WebElement test6Option;
	@FindBy(xpath = "//a[text()='test 7 (0)']")
	WebElement test7Option;
	@FindBy(xpath = "//a[text()='test 8 (0)']")
	WebElement test8Option;
	@FindBy(xpath = "//a[text()='test 9 (0)']")
	WebElement test9Option;
	@FindBy(xpath = "//a[text()='test 10 (0)']")
	WebElement test10Option;

	public Mp3player(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickMp3playersoption() {
		CommonMethods methods = new CommonMethods();
		methods.clickElement(Mp3playerLnk);
		methods.clickElement(test11Option);
		methods.clickElement(test12Option);
		methods.clickElement(test15Option);
		methods.clickElement(test16Option);
		methods.clickElement(test17Option);
		methods.clickElement(test18Option);
		methods.clickElement(test19Option);
		methods.clickElement(test20Option);
		methods.clickElement(test21Option);
		methods.clickElement(test22Option);
		methods.clickElement(test23Option);
		methods.clickElement(test24Option);
		methods.clickElement(test4Option);
		methods.clickElement(test5Option);
		methods.clickElement(test6Option);
		methods.clickElement(test7Option);
		methods.clickElement(test8Option);
		methods.clickElement(test9Option);
		methods.clickElement(test10Option);

	}

}
