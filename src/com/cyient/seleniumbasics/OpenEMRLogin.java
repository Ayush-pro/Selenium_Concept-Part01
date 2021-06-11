package com.cyient.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenEMRLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
//non-static methods--->get
		//use System.setProperty-download and adding support/driver file detail
		//download the driver and paste it inside the project home directory
		//
	    WebDriver driver = new ChromeDriver();
		//WebDriver driver = new Firefox();
		driver.get("http://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		//dropdown
		//Select selectLanguage = new Select(driver.findElement(By.name("LanguageChoices")));
		//selectLanguage.selectByVisibleText("English (Indian)");
		//only on anchor tag yoiu can use linkText and partial link text
		//for clicking on Login we can use
	   
	          Select selectLanguage=new Select(driver.findElement(By.name("languageChoice")));
	          selectLanguage.selectByVisibleText("English (Indian)");
	    
	
