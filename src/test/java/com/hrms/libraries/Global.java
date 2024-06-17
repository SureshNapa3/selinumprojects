package com.hrms.libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Global {
	public WebDriver driver;

	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un  = "nareshit";
	public String pw  = "nareshit";
	
	public String txt_loginname = "//input[@name='txtUserName']";
	public String txt_password  = "//input[@name='txtPassword']";
	public String submit        = "Submit";

	
	
}
