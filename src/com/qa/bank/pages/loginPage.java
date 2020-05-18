package com.qa.bank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.bank.base.Base;

public class loginPage extends Base{
	
	
	static WebElement username = driver.findElement(By.name("uid"));
	static WebElement password = driver.findElement(By.name("password"));
	static WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	
			public static void loginAction() {
		username.findElement(By.name("mngr260971"));
		password.findElement(By.name("pEtaqat"));
		loginBtn.click();
			
	}

}
