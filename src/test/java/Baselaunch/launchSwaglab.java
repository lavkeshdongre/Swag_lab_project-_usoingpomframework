package Baselaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class launchSwaglab {
	
    public WebDriver driver;
   @BeforeMethod
	public void launchbrowser() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
	}
   
   
//   @AfterMethod
//   public void closeWindow() {
//	   if(driver!=null) {
//		   driver.quit();
//		   
//	   }
//   }
}
