package com.cyient.seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class MagentoRegistration {

 

	        public static void main(String[] args) {
	                // TODO Auto-generated method stub
	                WebDriver driver=new ChromeDriver();
	                driver.get("http://Magento.com/");
	               //sign in
	                driver.findElement(By.linkText("Sign in")).click();
	                driver.findElement(By.linkText("Create an account")).click();
	                
	                //register
	                driver.findElement(By.id("firstname")).sendKeys("Kane");
	                driver.findElement(By.id("lastname")).sendKeys("Williamson");
	                driver.findElement(By.id("email_address")).sendKeys("kw@gmail.com");
	                driver.findElement(By.id("self_defined_company")).sendKeys("NewZeal");
	                Select selectCompany = new Select(driver.findElement(By.id("company_type")));
	    
	            selectCompany.selectByVisibleText("Tech Partner");
	                //ROLE
	        Select selectRole = new Select(driver.findElement(By.id("individual_role")));
	        selectRole.selectByVisibleText("Technical/developer");
	        
	        //COUNTRY
	        Select selectCountry = new Select(driver.findElement(By.id("country")));
	        selectCountry.selectByVisibleText("NewZealand");

	        
	        
	        }

	}

