package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends DriverInstance {

	private String UserNameTxt="//input[@placeholder='Username']";
	private String PasswordTxt = "//input[@placeholder='Password']";
	private String LoginBtn = "//span[text()='Login']";
	private String usernameValue ="//a[@class='mat-mdc-menu-trigger mdc-button mdc-button--unelevated mat-mdc-unelevated-button mat-primary mat-mdc-button-base ng-star-inserted']/span[@class='mdc-button__label']/span";
    private String errorMsg = "//mat-error[@id='mat-mdc-error-0']"; 
	private String ExpectedErrorMsg ="Username or Password is incorrect.";
    
	@Given("the user enters the username as {string}")
	public void theUserEntersTheUsernameAsNAME(String userName) {
		driver.findElement(By.xpath(UserNameTxt))
		.sendKeys(userName);
	}
	@Given("the user enters the password as {string}")
	public void theUserEntersThePasswordAsPASSWORD(String Pasword) {
		driver.findElement(By.xpath(PasswordTxt))
		.sendKeys(Pasword);
	}
	@When("the user clicks on the login button")
	public void theUserClicksOnTheLoginButton() {
		driver.findElement(By.xpath(LoginBtn))
		.click();
	}
	@Then("the user should be able to login successfully")
	public void theUserShouldBeAbleToLoginSuccessfully() {
		WebElement userName = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(usernameValue))));
		Assert.assertTrue(userName.isDisplayed());
	}


	@Then("the user should not be able to login successfully")
	public void theUserShouldNotBeAbleToLoginSuccessfully() {

		String errMsg = driver.findElement(By.xpath(errorMsg))
				.getText();
		Assert.assertEquals(errMsg, ExpectedErrorMsg);
	}
	@Given("the user should login as {string} and {string}") 
	public void theUserShouldLoginAsAnd(String userName, String Pasword) {
		
		this.theUserEntersTheUsernameAsNAME(userName);
        this.theUserEntersThePasswordAsPASSWORD(Pasword);
        this.theUserClicksOnTheLoginButton();
        this.theUserShouldBeAbleToLoginSuccessfully();

	}
}

