package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddButton {
	@Test(priority = 12)
	public void clickadd() throws InterruptedException {
	Thread.sleep(3000);
	configuration.driver.findElement(By.name("btnAdd")).click();
	}

	@Test(priority = 13)

	public void validate_addbtnUrl() {

	configuration.test = configuration.extent.createTest("Validate add button URL", "url should contain saveSystemUser");

	if (configuration.driver.getCurrentUrl().contains("saveSystemUser")){



	configuration.test_result = true;
	configuration.output = "url contains saveSystemUser";
	}
	else {
	configuration.test_result = false;
	configuration.output = "url does not contain saveSystemUser";
	}
	assertTrue(configuration.test_result);
	configuration.test.pass(configuration.output);
	}

	@Test(priority = 14)
	public void validateAdd () {
	configuration.test = configuration.extent.createTest("Validate Add User H1", "Add User H1 should display ");

	WebElement add_user = configuration.driver.findElement(By.id("UserHeading"));

	if(add_user.isDisplayed()) {

	configuration.test.pass("Add User is displayed");
	}
	}


}
