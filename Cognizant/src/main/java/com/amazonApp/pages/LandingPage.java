package com.amazonApp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingPage {
	AndroidDriver driver;
	

	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")
	private MobileElement btnSignInWithExistingAccount;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/new_user")
	private MobileElement btnCreateAccount;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/skip_sign_in_button")
	private MobileElement btnSkipSignIn;
	
// 
	
	
	
	public void skipSignIn() {
		btnSkipSignIn.click();
	}
	
	public LandingPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public void createNewAccount() {
		btnCreateAccount.click();
	}
	
	public void proceedWithExistingAccount() {
		btnSignInWithExistingAccount.click();
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}
	
}
