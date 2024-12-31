package pages;

import org.openqa.selenium.By;

import base.DriverInstance;
import io.cucumber.java.en.When;

public class HomePage extends DriverInstance {
	
	private String AddToCartBtn = "//span[normalize-space()='Add to Cart']";
	
	@When("user add the book to the cart")
	public void userAddTheBookToTheCart() {
		driver.findElement(By.xpath(AddToCartBtn)).click();
	}
}
