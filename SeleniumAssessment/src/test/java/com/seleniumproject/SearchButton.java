package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchButton {

	@Test(priority = 17)



	public void click_search() throws InterruptedException {
		Thread.sleep(2000);
		configuration.driver.findElement(By.name("searchSystemUser[userName]")).clear();
		configuration.driver.findElement(By.name("searchSystemUser[userName]")).sendKeys(Inputs.username);



		configuration.driver.findElement(By.id("searchBtn")).click();
	}



	@Test(priority = 18)



	public void validate_username() {



		configuration.test = configuration.extent.createTest("Validate if usernames are matching", "Verify if usernames are matching");



		WebElement user_table = configuration.driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[2]/a"));




		if (user_table.getText().equalsIgnoreCase(Inputs.username)) {



			configuration.test_result = true;
			configuration.output = "Usernames are matching";
		}
		else {



			configuration.test_result = false;
			configuration.output = "Usernames are NOT matching";
		}
		assertTrue(configuration.test_result);
		configuration.test.pass(configuration.output);
	}



	@Test(priority = 19)



	public void validate_employeeName() {



		configuration.test = configuration.extent.createTest("Validate employee name", "Verify if employee name is Alice Duval");



		WebElement emp_table = configuration.driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[4]"));




		if (emp_table.getText().equalsIgnoreCase("Alice Duval")) {



			configuration.test_result = true;
			configuration.output = "employee names are matching";
		}
		else {



			configuration.test_result = false;
			configuration.output = "employee names are NOT matching";
		}
		assertTrue(configuration.test_result);
		configuration.test.pass(configuration.output);
	}



	@Test(priority = 20)



	public void validate_status() {



		configuration.test = configuration.extent.createTest("Validate if status is enabled", "Verify if status is enabled");



		WebElement status_table = configuration.driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[5]"));




		if (status_table.getText().equalsIgnoreCase(Inputs.status)) {



			configuration.test_result = true;
			configuration.output = "status is enabled";
		}
		else {



			configuration.test_result = false;
			configuration.output = "status is NOT enabled";
		}
		assertTrue(configuration.test_result);
		configuration.test.pass(configuration.output);
	}
}
