package com.qt.testcases;

import org.junit.Assert;

import com.qt.selenium.DriverManager;
import com.qt.selenium.pom.DeskTopPage;
import com.qt.selenium.pom.InstaGramLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {


	@Given("User is launch the application")
	public void user_is_launch_the_application() {
		DriverManager.launchBrowser();
	}
	
	@When("User select the {string}")
	public void user_select_the(String option) {
		DeskTopPage menuPage=new DeskTopPage(DriverManager.getCurrentDriver());
		menuPage.clickpOption(option);
	}


	@Then("pc and mac details should be displayed")
	public void pc_and_mac_details_should_be_displayed() {
		DeskTopPage menuPage=new DeskTopPage(DriverManager.getCurrentDriver());
		menuPage.verifyMacResults();
		Assert.fail();
	}
	
	@When("user enter the correct {string} and {string}")
	public void user_enter_the_correct_and(String userName, String password) {
		InstaGramLoginPage login=new InstaGramLoginPage(DriverManager.getCurrentDriver());
		login.loginTothePage(userName, password);

	}

	@Then("User is able to login to the application")
	public void user_is_able_to_login_to_the_application() {
		DriverManager.closeDriver();

	}

}
