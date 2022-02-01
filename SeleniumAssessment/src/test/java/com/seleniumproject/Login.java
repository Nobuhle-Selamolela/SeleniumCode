package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login {
	@Test(priority = 2)
	public void login() {



	configuration.driver.findElement(By.name(Locators.uname)).clear();
	configuration.driver.findElement(By.name(Locators.uname)).sendKeys(Inputs.uname);
	configuration.driver.findElement(By.name(Locators.password)).clear();
	configuration.driver.findElement(By.name(Locators.password)).sendKeys(Inputs.password);
	configuration.driver.findElement(By.name("Submit")).click();



	}



	@Test(priority = 3)
	public void Valid_url() {



	configuration.test = configuration.extent.createTest("Validate URL", "checking the presence of keyword Dashboard in the URL");
	if (configuration.driver.getCurrentUrl().contains("dashboard")){



	configuration.test_result = true;
	configuration.output = "url contains dashboard";
	}
	else {
	configuration.test_result = false;
	configuration.output = "url does not contain dashboard";
	}
	assertTrue(configuration.test_result);
	configuration.test.pass(configuration.output);
	}



	@Test(priority = 4)



	public void check_admin() {
	configuration.test = configuration.extent.createTest("check admin tap", "checking the presence of admin tap");



	//calling web element by linkText
	WebElement admin_tab = configuration.driver.findElement(By.linkText("Admin"));





	//checking if admin tab is displayed or not
	if(admin_tab.isDisplayed()) {
	configuration.test.pass("Admin tab is displayed");
	configuration.logger.info("Test Passed. admin tab is available");
	}
	}



	@Test(priority = 5)



	public void check_welcome() {



	//test case and description
	configuration.test = configuration.extent.createTest("Welcome Admin should display at right panel", "Validate that welcome Admin should display at right panel");





	//calling web element by linkText
	WebElement welcome_admin = configuration.driver.findElement(By.id("welcome"));





	//checking if welcome admin tab is displayed at right panel or not
	if(welcome_admin.isDisplayed()) {
	configuration.test.pass("welcome Admin is displayed");
	configuration.logger.info("Test Passed");
	}
	}
	



}
