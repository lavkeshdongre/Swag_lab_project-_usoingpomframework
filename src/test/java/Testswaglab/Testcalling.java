package Testswaglab;

import org.testng.annotations.Test;

import Baselaunch.launchSwaglab;
import PagesScript.SwagwriteScript;

public class Testcalling extends launchSwaglab {
	
	SwagwriteScript swag;
	@Test
	public void senddata() {
		swag = new SwagwriteScript(driver);
		swag.username("standard_user");
		swag.password("secret_sauce");
		swag.clickbtn();
	}

}
