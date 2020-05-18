package com.qa.bank.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	Properties prop = new Properties(); 
	FileInputStream ip = new FileInputStream("C:\\Users\\Siri\\eclipse-workspace\\GuruBanking\\src\\com\\qa\\bank\\config\\config.prop");
	prop.load(ip);
	String browserName=prop.getProperty("browserName");

if(browserName.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver","C://Users//Siri//Downloads//OSV//chromedriver_win32//chromedriver.exe/");
	driver = new ChromeDriver();
	 driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	
}
else if(browserName.equalsIgnoreCase("FF")){
	driver = new FirefoxDriver();
}
	else{
		System.out.println(" given browser not configured");
		
	}
   
	}
	}

