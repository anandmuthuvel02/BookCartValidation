package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/com/features/login.feature"},
		glue = {"com.stepdefenitions","com.hooks"},
		dryRun =!true,
		snippets = SnippetType.CAMELCASE,
		monochrome =true,
		//plugin= "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		plugin= {"pretty",
				"html:reports/cucumber.html",
				"json:reports/results.json",
				"junit:reports/results.xml"}
		//,tags = "@regression"
		)

public class testRunner extends AbstractTestNGCucumberTests {

}
