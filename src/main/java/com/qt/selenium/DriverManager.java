package com.qt.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager{
	
	public static WebDriver driver; 
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(ProjectConfig.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public static void closeDriver() {
		driver.close();
	}
	
	public static void closeCurrentWindow() {
		driver.quit();
	}
	
	public static WebDriver getCurrentDriver() {
		return driver;
	}
	
	public static void main(String[] args) {
		launchBrowser();
	}
	
}
