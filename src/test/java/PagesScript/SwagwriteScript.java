package PagesScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	
//	public boolean clickbtn() {
//
//	    WebDriverWait wait =
//	            new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	    driver.findElement(By.id("login-button")).click();
//
//	    // Login successful zala tar Products title disel
//	    try {
//	        wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.className("title")),
//	            ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-test='error']"))));
//
//	        if (driver.findElements(
//	                By.cssSelector("[data-test='error']")).size() > 0) {
//
//	            String errorMessage = driver.findElement(By.cssSelector("[data-test='error']")).getText();
//
//	            System.out.println("Login failed: " + errorMessage);
//	            return false;
//	        }
//
//	        System.out.println("Login successful");
//	        return true;
//
//	    } catch (org.openqa.selenium.TimeoutException e) {
//	        System.out.println("Login result could not be verified");
//	        throw e;
//	    }
//	}
	//We handle the Filter option
	public void filter() throws InterruptedException {

		//chatgpt code
		WebElement Filters = driver.findElement(By.className("product_sort_container"));

			Select filter = new Select(Filters);

			// First filter
			filter.selectByVisibleText("Name (A to Z)");
			System.out.println("First filter applied");

			// Second filter
			filter.selectByVisibleText("Name (Z to A)");
			System.out.println("Second filter applied");

			// Third filter
			filter.selectByIndex(2);
			System.out.println("Third filter applied: " +
			    filter.getFirstSelectedOption().getText());

			// Fourth filter
			filter.selectByIndex(3);
			System.out.println("Fourth filter applied: " +
			    filter.getFirstSelectedOption().getText());

	}
	
	//check Add to cart functionality
	public void Addtocart() throws InterruptedException {
		
		//click to add to cart all
		
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		driver.findElement(By.id("add-to-cart")).click();
		driver.navigate().back();		
		System.out.println("1st product add to cart");
		driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
		driver.findElement(By.id("add-to-cart")).click();
		System.out.println("2st product add to cart");
		driver.navigate().back();	
		driver.findElement(By.linkText("Sauce Labs Bike Light")).click();
		driver.findElement(By.id("add-to-cart")).click();
		System.out.println("3rd product add to cart");
		driver.navigate().back();	
		driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
		driver.findElement(By.id("add-to-cart")).click();
		System.out.println("4rt product add to cart");
		driver.navigate().back();	
		driver.findElement(By.linkText("Sauce Labs Onesie")).click();
		driver.findElement(By.id("add-to-cart")).click();
		System.out.println("5th product add to cart");
		driver.navigate().back();	
		driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)")).click();
		driver.findElement(By.id("add-to-cart")).click();	
		System.out.println("6th product add to cart");
		driver.navigate().back();	
		
		//click on bucket button
		driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
		
		//click on the checkout
		
		
		driver.findElement(By.id("checkout")).click();
		
		//Enter data in the "your information"
		
		driver.findElement(By.id("first-name")).sendKeys("lavkesh");
		driver.findElement(By.id("last-name")).sendKeys("Dongre");
		driver.findElement(By.id("postal-code")).sendKeys("442201");
		
		//click on the continue button
		 driver.findElement(By.id("continue")).click();
		 
		 driver.findElement(By.id("finish")).click();
		 //generete pdf
		driver.findElement(By.id("generate-pdf-order")).click();
		 
		 driver.findElement(By.id("back-to-products")).click();
		 
		
		
		
	   Thread.sleep(1000);

		
	}
	
	public void log_out() {
         driver.findElement(By.id("react-burger-menu-btn")).click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		 WebElement logout = wait.until( ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));

		 // : Use JavaScriptExecutor to click
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();", logout);
	     System.out.println("Logout Successfully");
	    
	}
	}

