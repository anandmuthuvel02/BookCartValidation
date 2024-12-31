package com.hooks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;

public class Hooks extends DriverInstance {

	//For steps
	@BeforeStep
	public void beforeStep(Scenario scenario) {
		if(scenario.isFailed()) {
			byte []srcimg = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcimg,"image/png",scenario.getName());
		}

	}
	@AfterStep
	public void AfterStep(Scenario scenario) {
		if(scenario.isFailed()) {
			byte []srcimg = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcimg,"image/png",scenario.getName());
		}

	}
	// for scenario
	@Before
	public void beforeScenario(Scenario scenario) {
		driver =new ChromeDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(20));

		driver.get("https://bookcart.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	@After("@cleanUp")
	public void cleanData(Scenario scenario){

		driver.findElement(By.xpath("//body[1]/app-root[1]/app-nav-bar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[3]/button[2]/span[3]"))
		.click();
		driver.findElement(By.xpath("//button[@class='mat-elevation-z4 mdc-button mdc-button--raised mat-mdc-raised-button mat-unthemed mat-mdc-button-base']"))
		.click();
		String cartEmtyMsg =driver.findElement(By.cssSelector(".mat-mdc-card.mdc-card.ng-star-inserted .mat-mdc-card-title ")).getText();
		Assert.assertEquals(cartEmtyMsg, "Your shopping cart is empty.");
		if(scenario.isFailed()) {
			byte []srcimg = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcimg,"image/png",scenario.getName());

		}
		else {
			byte []srcimg = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcimg,"image/png",scenario.getName());
		}
	}		

	@After(order=2)
	public void afterScenario(Scenario scenario){
		if(scenario.isFailed()) {
			byte []srcimg = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcimg,"image/png",scenario.getName());
			driver.quit();
		}
		else {
			byte []srcimg = driver.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcimg,"image/png",scenario.getName());
			driver.quit();
		}

	}
}
