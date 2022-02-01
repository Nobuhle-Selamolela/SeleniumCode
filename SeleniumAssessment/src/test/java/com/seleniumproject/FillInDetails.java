package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FillInDetails {

	@Test(priority = 15)
	public void enter_info() throws InterruptedException {




	Select role = new Select(configuration.driver.findElement(By.name(Locators.role)));
	role.selectByVisibleText(Inputs.role);
	configuration.driver.findElement(By.name(Locators.emp_name)).clear();
	configuration.driver.findElement(By.name(Locators.emp_name)).sendKeys(Inputs.emp_name);

	configuration.driver.findElement(By.name(Locators.username)).clear();
	configuration.driver.findElement(By.name(Locators.username)).sendKeys(Inputs.username);

	Select status = new Select(configuration.driver.findElement(By.name(Locators.status)));
	status.selectByVisibleText(Inputs.status);



	configuration.driver.findElement(By.name(Locators.pword)).clear();
	configuration.driver.findElement(By.name(Locators.pword)).sendKeys(Inputs.pword);

	configuration.driver.findElement(By.name(Locators.re_pword)).clear();
	configuration.driver.findElement(By.name(Locators.re_pword)).sendKeys(Inputs.re_pword);

	Thread.sleep(2000);
	WebElement save = configuration.driver.findElement(By.name("btnSave"));
	save.click();
	}

	@Test(priority = 16)
	public void validate_status() {

	configuration.test = configuration.extent.createTest("Validate dropdown status", "Verify Status dropdown is Selected to enable.");

	Select status = new Select(configuration.driver.findElement(By.name(Locators.status)));
	if (status.getFirstSelectedOption().getText().equalsIgnoreCase("Enabled")) {



	configuration.test_result = true;
	configuration.output = "status dropdown is selected to enabled";
	}
	else {
	configuration.test_result = false;
	configuration.output = "status dropdown is not selected to enabled";
	}
	assertTrue(configuration.test_result);
	configuration.test.pass(configuration.output);

	}
}
