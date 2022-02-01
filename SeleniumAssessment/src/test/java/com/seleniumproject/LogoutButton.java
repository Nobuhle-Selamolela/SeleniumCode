package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogoutButton {

	@Test(priority = 23)



	public void logout() throws InterruptedException {



		configuration.driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		configuration.driver.findElement(By.linkText("Logout")).click();
	}



	@Test(priority = 24)



	public void validate_url_landingPage() {



		configuration.test = configuration.extent.createTest("Validate URL(login) for landing page", "Validate URL for landing page");



		if (configuration.driver.getCurrentUrl().contains("login")){



			configuration.test_result = true;
			configuration.output = "url contains login";
		}
		else {
			configuration.test_result = false;
			configuration.output = "url does not contain login";
		}
		assertTrue(configuration.test_result);
		configuration.test.pass(configuration.output);
	}



	@Test(priority = 25)



	public void validate_url_landingPage2() {



		configuration.test = configuration.extent.createTest("Validate URL(OrangeHRM) for landing page", "Validate URL for landing page");



		if (configuration.driver.getCurrentUrl().contains("OrangeHRM")){



			configuration.test_result = true;
			configuration.output = "url contains OrangeHRM";
		}
		else {
			configuration.test_result = false;
			configuration.output = "url does not contain OrangeHRM";
		}
		assertTrue(configuration.test_result);
		configuration.test.pass(configuration.output);
	}
}
