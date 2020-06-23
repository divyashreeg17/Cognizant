package com.amazonApp.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.amazonApp.lib.BaseLib;
import com.amazonApp.pages.CheckOutPage;
import com.amazonApp.pages.HomePage;
import com.amazonApp.pages.LandingPage;
import com.amazonApp.pages.LoginPage;
import com.amazonApp.pages.SearchResultPage;
import com.amazonApp.utils.MobileActionUtil;

public class PurchaseAnItemTest extends BaseLib{
	
	
	@Test(enabled=false)
	public void tc_001_loginWithProperCredentials() {
		gv.driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		LandingPage landingPage = new LandingPage(gv.driver);
		landingPage.proceedWithExistingAccount();
		LoginPage loginPage = new LoginPage(gv.driver);
		loginPage.loginWithExistingAccount();
		WebDriverWait wait = new WebDriverWait(gv.driver, 100);
		HomePage homePage = new HomePage(gv.driver);
		wait.until(ExpectedConditions.visibilityOf(homePage.getAmazonHome()));
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(homePage.getAmazonHome().isDisplayed());
		
	}
	
	@Test
	public void tc_002_addToCart() {
		HomePage homePage = new HomePage(gv.driver);
		homePage.searchFor("iphone");
		homePage.addiPhoneToCart();
	}
	
	@Test
	public void tc_003_SearchScreenVsCheckOutScreen() throws Exception{
		HomePage homePage = new HomePage(gv.driver);
		homePage.searchFor("64 inch TV");
		MobileActionUtil.swipeBottomToTop(2,0.8,0.2,gv.driver);
		SearchResultPage searchResultPage = new SearchResultPage();
		String description = searchResultPage.getDescriptionFromSearchResultPage();
		String price = searchResultPage.getPrice();
		searchResultPage.selectItem();
		MobileActionUtil.swipeBottomToTop(2,0.8,0.2,gv.driver);
		searchResultPage.clickBuyNow();
		CheckOutPage checkOutPage = new CheckOutPage(gv.driver);
		String descriptionFromCheckOut = checkOutPage.getDescriptionFromCheckOutPage();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(description, descriptionFromCheckOut);
		
	}
	
}
