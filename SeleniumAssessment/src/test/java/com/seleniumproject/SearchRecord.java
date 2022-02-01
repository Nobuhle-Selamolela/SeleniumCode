package com.seleniumproject;
/*
 * @Author: Nobuhle Selamolela 
 * @Date: 2022/01/31
 */
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchRecord {

@Test(priority = 22)



public void search_deleted() throws InterruptedException {
Thread.sleep(2000);
configuration.driver.findElement(By.name("searchSystemUser[userName]")).clear();
configuration.driver.findElement(By.name("searchSystemUser[userName]")).sendKeys(Inputs.username);

configuration.driver.findElement(By.id("searchBtn")).click();
}

}
