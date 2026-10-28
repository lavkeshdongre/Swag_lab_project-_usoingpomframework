package PagesScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baselaunch.launchSwaglab;

public class SwagwriteScript {
	
  public WebDriver driver;
	
	public SwagwriteScript(WebDriver driver) {
	this.driver =driver;
}

	public void username(String uname) {
		driver.findElement(By.id("user-name")).sendKeys(uname);
		System.out.println(uname);
		
	}
	
	public void password(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}
	
	public void clickbtn() throws InterruptedException {
		try {
		driver.findElement(By.id("login-button")).click();
		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated( By.className("title")));
		System.out.println("Current page is :-" + driver.getTitle());
		
		
		

	    System.out.println("Login successful for current user");
	    System.out.println("Current page is: " + driver.getTitle());
	    
	   
		
		}
	
	catch(Exception e) {
		System.out.println("Current user fail");
		System.out.println("Failed"+e.getMessage());
		throw e;
		
		
	}
	}
	//We handle the Filter option
	public void filter() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));

		System.out.println("Login successful");
		
		WebElement Filters = driver.findElement(By.className("product_sort_container"));
		Select filter = new Select(Filters);
		
		filter.selectByIndex(0);
		System.out.println("First filter apply");
		
		Thread.sleep(1000);
		
		filter.selectByIndex(1);
		System.out.println("Second  filter apply");
		Thread.sleep(1000);
		
		filter.selectByIndex(2);
		System.out.println("Third filter apply");
		Thread.sleep(1000);
		
		filter.selectByIndex(3);
		System.out.println("fourth filter apply");
		Thread.sleep(1000);
	}
	
	//check Add to cart functionality
	public void Addtocart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement backpack = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")));
		backpack.click();
		//driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
		System.out.println("Item 1 added to cart backpack");
		WebElement jacket = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='add-to-cart-sauce-labs-fleece-jacket']")));
		jacket.click();
		System.out.println("Item 1 added to cart jacket");
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")).click();
		

		WebElement redShirt = wait.until( ExpectedConditions.elementToBeClickable(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")));

		redShirt.click();

		System.out.println("Red T-shirt added to cart");
		System.out.println("Item 1 added to cart red Shirt");
		
	}
	
	public void log_out() throws InterruptedException {
	
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		    wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn"))).click();
		    wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link"))).click();
		}
	}

