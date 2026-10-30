package Testswaglab;

import org.openqa.selenium.bidi.module.Script;
import org.testng.annotations.Test;

import Baselaunch.launchSwaglab;
import PagesScript.SwagwriteScript;

public class invaliddata_check extends launchSwaglab{
	SwagwriteScript invalid;
	@Test
	public void invaliddata() throws InterruptedException {
		invalid = new SwagwriteScript(driver);
		invalid.username("");
		invalid.password("secret_sauce");
		invalid.clickbtn();
		
		invalid.username("standard_user");
		invalid.password("secret_sauce");
		invalid.click();
	}

}
