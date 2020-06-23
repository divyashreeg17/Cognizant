package com.amazonApp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazonApp.lib.BaseLib;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BaseLib{
	
	@AndroidFindBy(accessibility="Login. Already a customer?")
	private MobileElement radioBtnLogin;
	
	@AndroidFindBy(accessibility="Create account. New to Amazon?")
	private MobileElement radioBtnCreateAccount;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText")
	private MobileElement txtFldMobileNum;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button")
	private MobileElement btnContinue;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View[2]/android.widget.EditText")
	private MobileElement txtFldPassword;
	
	@AndroidFindBy(xpath="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[5]/android.view.View[6]/android.widget.Button")
	private MobileElement btnLogin;

	AndroidDriver driver;
	
	public LoginPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void loginWithExistingAccount() {
		//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(txtFldMobileNum));
		//txtFldMobileNum.click();
		txtFldMobileNum.sendKeys(gv.UserContNum);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		btnContinue.click();
		wait.until(ExpectedConditions.visibilityOf(txtFldPassword));
		txtFldPassword.sendKeys(gv.UserPwd);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
		System.out.println(gv.UserPwd);
		btnLogin.click();
	}

}
