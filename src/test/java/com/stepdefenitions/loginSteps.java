package com.stepdefenitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.drivers.DriverInstance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends DriverInstance{

	@Given("the user clicks on the login option")
	public void theUserClicksOnTheLoginOption() {
		driver.findElement(By.xpath("//div[@class='d-flex align-items-center']/descendant::span[normalize-space()='Login']"))
		.click();
	}

	@Given("the user enters the username as {string}")
	public void theUserEntersTheUsernameAsNAME(String userName) {
		driver.findElement(By.xpath("//input[@placeholder='Username']"))
		.sendKeys(userName);
	}
	@Given("the user enters the password as {string}")
	public void theUserEntersThePasswordAsPASSWORD(String Pasword) {
		driver.findElement(By.xpath("//input[@placeholder='Password']"))
		.sendKeys(Pasword);
	}
	@When("the user clicks on the login button")
	public void theUserClicksOnTheLoginButton() {
		driver.findElement(By.xpath("//span[text()='Login']"))
		.click();
	}
	@Then("the user should be able to login successfully")
	public void theUserShouldBeAbleToLoginSuccessfully() {
		String usernamepath ="//a[@class='mat-mdc-menu-trigger mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base ng-star-inserted']/span[@class='mdc-button__label']/span";
		String UserName = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(usernamepath))))
				.getText();
		Assert.assertEquals(UserName, "anan");
	}


	@Then("the user should not be able to login successfully")
	public void theUserShouldNotBeAbleToLoginSuccessfully() {

		String errMsg = driver.findElement(By.xpath("//mat-error[@id='mat-mdc-error-0']"))
				.getText();
		Assert.assertEquals(errMsg, "Username or Password is incorrect.");
		driver.quit();
	}
}
