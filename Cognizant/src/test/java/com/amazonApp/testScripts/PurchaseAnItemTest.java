package com.amazonApp.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.amazonApp.lib.BaseLib;
import com.amazonApp.pages.HomePage;
import com.amazonApp.pages.LandingPage;
import com.amazonApp.pages.LoginPage;

public class PurchaseAnItemTest extends BaseLib{
	
	
	@Test
	public void tc_001_loginWithProperCredentials() {
//		gv.driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
//		LandingPage landingPage = new LandingPage(gv.driver);
//		landingPage.proceedWithExistingAccount();
//		LoginPage loginPage = new LoginPage(gv.driver);
//		loginPage.loginWithExistingAccount();
		WebDriverWait wait = new WebDriverWait(gv.driver, 100);
		HomePage homePage = new HomePage(gv.driver);
		wait.until(ExpectedConditions.visibilityOf(homePage.getAmazonHome()));
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertTrue(homePage.getAmazonHome().isDisplayed());
		homePage.searchFor("iphone");
		homePage.addiPhoneToCart();
	}
}
