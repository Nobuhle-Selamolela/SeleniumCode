package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AdminTab {

	@Test(priority = 6)
	public void admintap() throws InterruptedException {
	Thread.sleep(2000);
	configuration.driver.findElement(By.linkText("Admin")).click();



	}
	// validate url for admin

	@Test(priority = 7)
	public void Validate_adminUrl() {



	configuration.test = configuration.extent.createTest("Validate admin tap URL", "url should contain admin/viewSystemUsers");




	if (configuration.driver.getCurrentUrl().contains("admin/viewSystemUsers")){



	configuration.test_result = true;
	configuration.output = "url contains admin/viewSystemUsers";
	}
	else {
	configuration.test_result = false;
	configuration.output = "url does not contain admin/viewSystemUsers";
	}
	assertTrue(configuration.test_result);
	configuration.test.pass(configuration.output);
	}

	// validate add button

	@Test(priority = 8)
	public void validateAdd () {
	configuration.test = configuration.extent.createTest("Add button should be displayed", "Validate that add button is displayed");

	WebElement add = configuration.driver.findElement(By.name("btnAdd"));

	if(add.isDisplayed()) {

	configuration.test.pass("Add button is displayed");
	}
	}

	// validate Delete button
	@Test (priority = 9)
	public void validateDelete() {
	configuration.test = configuration.extent.createTest("Delete button should be displayed", "Validate that delete button is displayed");

	WebElement delete = configuration.driver.findElement(By.id("btnDelete"));
	if(delete.isDisplayed()) {

	configuration.test.pass("Delete button is displayed");
	}
	}

	// validate search button
	@Test(priority = 10)
	public void validateSearch() {
	configuration.test = configuration.extent.createTest("Search button should be displayed", "Validate that search button is displayed");

	WebElement search = configuration.driver.findElement(By.id("searchBtn"));

	if(search.isDisplayed()) {
	configuration.test.pass("Search button is displayed");
	}
	}

	// validate Reset button
	@Test(priority = 11)
	public void validateReset() {
	configuration.test = configuration.extent.createTest("Reset button should be displayed", "Validate that reset button is displayed");

	WebElement reset = configuration.driver.findElement(By.id("resetBtn"));

	if(reset.isDisplayed()) {
	configuration.test.pass("Reset button is displayed");
	}
	}


	
}
