package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteButton {

	@Test(priority = 21)



	public void delete_record() throws InterruptedException {


	WebElement check_box = configuration.driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectAll\"]"));
	Thread.sleep(2000);
	check_box.click();

	configuration.driver.findElement(By.id("btnDelete")).click();
	Thread.sleep(3000);
	configuration.driver.findElement(By.id("dialogDeleteBtn")).click();


	}


}
