/*
 * package com.stepdefenitions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import org.testng.Assert;
 * 
 * import base.DriverInstance; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 * public class addToCartSteps extends DriverInstance{
 * 
 * @Given("the user should login as {string} and {string}") public void
 * theUserShouldLoginAsAnd(String userName, String Pasword) {
 * driver.findElement(By.
 * xpath("//div[@class='d-flex align-items-center']/descendant::span[normalize-space()='Login']"
 * )) .click(); driver.findElement(By.xpath("//input[@placeholder='Username']"))
 * .sendKeys(userName);
 * driver.findElement(By.xpath("//input[@placeholder='Password']"))
 * .sendKeys(Pasword); driver.findElement(By.xpath("//span[text()='Login']"))
 * .click(); WebElement userNameele=driver.findElement(By.xpath(
 * "(//span[@class='mdc-button__label']/child::span)[1]"));
 * wait.until(ExpectedConditions.visibilityOf(userNameele)); }
 * 
 * @Given("the user search book {string}") public void theUserSearchBook(String
 * bookName) {
 * 
 * driver.findElement(By.cssSelector(".mat-mdc-autocomplete-trigger")).sendKeys(
 * bookName);
 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(
 * "#mat-autocomplete-0"))));
 * driver.findElement(By.cssSelector("#mat-autocomplete-0")).click();
 * 
 * }
 * 
 * @When("user add the book to the cart") public void userAddTheBookToTheCart()
 * {
 * driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click
 * (); }
 * 
 * @Then("The cart page should be updated") public void
 * theCartPageShouldBeUpdated() { String numOFbooks=
 * wait.until(ExpectedConditions.
 * visibilityOf(driver.findElement(By.xpath("//span[@id='mat-badge-content-0']")
 * ))).getText(); Assert.assertEquals(Integer.parseInt(numOFbooks)>0, true);
 * 
 * }
 * 
 * 
 * }
 */