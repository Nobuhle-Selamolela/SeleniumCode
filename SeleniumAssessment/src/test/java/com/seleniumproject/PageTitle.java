package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import static org.testng.Assert.assertEquals;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class PageTitle {
	@Test(priority = 1)

	public void first_test() {



	configuration.test =configuration.extent.createTest("Open orangeHRM URL", " get the title of the current page.");


	//URL to the website
	configuration.driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	String actualTitle = configuration.driver.getTitle();
	String expectedTitle = "OrangeHRM";

	assertEquals(actualTitle, expectedTitle);

	configuration.test.pass("Test Passed");
	}


	@AfterMethod
	public void EvaluateResult(ITestResult Results) {

	if(Results.getStatus() == ITestResult.FAILURE) {
		configuration.test.fail("Test Failed");
		configuration.logger.info("Test Failed");
	}

	}





}
