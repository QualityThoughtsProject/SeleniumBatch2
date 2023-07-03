package com.qt.selenium.pom;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles",
	    glue="TestDafenicens",
	    tags="@Testcases12",
		plugin = {"pretty","html:target/Cucumber/Report.html"}
		)
public class Runnerclass {
}
