package Testswaglab;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baselaunch.launchSwaglab;
import PagesScript.SwagwriteScript;

public class Testcalling extends launchSwaglab {
	
	SwagwriteScript swag;
	@Test(dataProvider = "senddata")
	public void senddata(String suname ,String spass) throws InterruptedException {
		swag = new SwagwriteScript(driver);
		swag.username(suname);
		swag.password(spass);
		swag.clickbtn();
		Thread.sleep(1000);
       // swag.filter();
    	swag.Addtocart();
    	swag.bucketFunctionality();
    	swag.log_out();		
	}

	 @DataProvider
	  public Object[][] senddata() {
	    return new Object[][] {
	   //   new Object[] { "standard_user", "secret_sauce" },
	      new Object[] { "problem_user", "secret_sauce" },
//	      new Object[] { "locked_out_user", "secret_sauce" },
//	      new Object[] { "performance_glitch_user", "secret_sauce" },
//	      new Object[] { "error_user", "secret_sauce" },
//	      new Object[] { "standard_user", "secret_sauce" },
	    };
	  }
}


