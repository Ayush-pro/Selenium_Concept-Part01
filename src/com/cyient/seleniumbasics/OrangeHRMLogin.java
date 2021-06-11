package com.cyient.seleniumbasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {
//	public static void main(String[] args) {
//WebDriver driver = new ChromeDriver();
//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
////driver.findElement(By.id(null))
//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//driver.findElement(By.id("btnLogin")).click();
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		driver.findElement(By.id("menu_pim_viewMyDetails")).click();

//		task 1
//		click on edit 
//		update --> Other Id as "test123"
//		click on save
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtOtherID")).sendKeys("test12345");
		driver.findElement(By.id("btnSave")).click();

//		task2
//		click on Emergency Contacts
//		click on add
//		add name, relationship, home Telephone, mobile, work Telephone
//		click on save
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.name("emgcontacts[name]")).sendKeys("Mak");
		driver.findElement(By.name("emgcontacts[relationship]")).sendKeys("Cousin");
		driver.findElement(By.name("emgcontacts[homePhone]")).sendKeys("010122221");
		driver.findElement(By.name("emgcontacts[mobilePhone]")).sendKeys("123456789");
		driver.findElement(By.id("emgcontacts_workPhone")).sendKeys("2342342341");
		driver.findElement(By.id("btnSaveEContact")).click();

	}
}