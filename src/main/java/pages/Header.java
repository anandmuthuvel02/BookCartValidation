package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import base.DriverInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Header extends DriverInstance {
	
	private  String LoginOption = "//div[@class='d-flex align-items-center']/descendant::span[normalize-space()='Login']";
	private  String SearchBar = ".mat-mdc-autocomplete-trigger";
	private  String OptionsDropdown = "#mat-autocomplete-0";
	private  String cartValueIcon = "//span[@id='mat-badge-content-0']";
	
	  @Given("the user clicks on the login option") public void
	  theUserClicksOnTheLoginOption() { driver.findElement(By.
	  xpath(LoginOption)) .click(); }
	 
	
	@Given("the user search book {string}")
	public void theUserSearchBook(String bookName) {

		driver.findElement(By.cssSelector(SearchBar)).sendKeys(bookName);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(OptionsDropdown))));
		driver.findElement(By.cssSelector(OptionsDropdown)).click();

	}
	@Then("The cart page should be updated")
	public void theCartPageShouldBeUpdated() throws InterruptedException {
		Thread.sleep(1000);
		String numOFbooks= wait.until(ExpectedConditions.
				visibilityOf(driver.findElement(By.xpath(cartValueIcon)))).getText();
		Assert.assertEquals(Integer.parseInt(numOFbooks)>0, true);
		
	}
}
