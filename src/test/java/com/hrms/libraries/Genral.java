package com.hrms.libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Genral extends Global {
	
	
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	public void application() {
		
		
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get(url);
		System.out.println();
		
		
	}
	
//	public void closeapplication() {
//		
//		driver.close();
//		System.out.println("closed");
//		
//		}
	 public void login() {
		 
		 //WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
		 
		 driver.findElement(By.xpath(txt_loginname)).sendKeys(un);
		 driver.findElement(By.xpath(txt_password)).sendKeys(pw);
		 driver.findElement(By.name(submit)).click();
		 System.out.println("yes successfull");
		 
	 }
	 public void addEmp() {
		 System.out.println("closed");
	 }
	
	
	
}         




        






