package Testswaglab;

import org.openqa.selenium.bidi.module.Script;
import org.testng.annotations.Test;

import Baselaunch.launchSwaglab;
import PagesScript.SwagwriteScript;

public class invaliddata_check extends launchSwaglab{
	SwagwriteScript invalid;
	@Test(priority=1)
	public void invaliddata() throws InterruptedException {
		invalid = new SwagwriteScript(driver);
		invalid.username("");
		invalid.password("secret_sauce");
		invalid.clickbtn();
		
	
	}
	@Test(priority=2)
	public void bothinvalid() throws InterruptedException {
		invalid = new SwagwriteScript(driver);
		
		invalid.username("");
		invalid.password("null");
		invalid.clickbtn();
		
		
	}
	@Test(priority=3)
	public void singleinvalid() throws InterruptedException {
		invalid = new SwagwriteScript(driver);
		
		invalid.username("standard_user");
		invalid.password("");
		invalid.clickbtn();
	}
	@Test(priority=4)
	public void withoutaddcart() throws InterruptedException {
		invalid = new SwagwriteScript(driver);
		
		invalid.username("standard_user");
		invalid.password("secret_sauce");
		invalid.clickbtn();
		invalid.bucketFunctionality();
		invalid.log_out();
		
		//error because cart madhi maximum ek tari product search pahije 
		// first user madhi without any item oan recept genrate hote that is also the bug
		
		
		
	}

}
