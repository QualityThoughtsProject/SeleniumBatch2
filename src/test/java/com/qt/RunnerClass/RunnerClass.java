package com.qt.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles",
		glue="com.qt.testcases",
		tags="@test",
		plugin = {"pretty","html:target/CucumberReport/Report.html"}
		)
public class RunnerClass {
	

}
