package PagesScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Baselaunch.launchSwaglab;

public class SwagwriteScript {
	
  public WebDriver driver;
	
	public SwagwriteScript(WebDriver driver) {
	this.driver =driver;
}

	public void username(String uname) {
		driver.findElement(By.id("user-name")).sendKeys(uname);
		
	}
	
	public void password(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}
	
	public void clickbtn() {
		driver.findElement(By.id("login-button")).click();
	}
}
