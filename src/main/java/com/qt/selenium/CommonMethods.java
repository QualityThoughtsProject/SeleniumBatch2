package com.qt.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends DriverManager {

	public void sendTextToElement(WebElement ele, String text) {
		try {
			ele.sendKeys(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void clickElement(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selecctValueFromDropDown(WebElement ele, String value) {
		try {
			Select sel = new Select(ele);
			sel.selectByVisibleText(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectValueFromDropdownWithoutSelect(List<WebElement> ele, String value) {
		for (WebElement index : ele) {
			if (index.getText().equals(value)) {
				index.click();
			}
		}
	}
	
	public void switchToFrame(WebElement ele) {
		DriverManager.getCurrentDriver().switchTo().frame(ele);
	}
	
	public void switchToDefault() {
		DriverManager.getCurrentDriver().switchTo().defaultContent();
	}
	

	public void waitforElementToLoad(By ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(ele));
	}
	
	public void moveToElement(WebElement ele) {
		try {
			Actions action=new Actions(DriverManager.getCurrentDriver());
			action.moveToElement(ele);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
