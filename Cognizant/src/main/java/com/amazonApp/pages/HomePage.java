package com.amazonApp.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazonApp.utils.MobileActionUtil;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	AndroidDriver driver;
	
	@AndroidFindBy(accessibility="Home")
	private MobileElement amazonHome;
	
	@AndroidFindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
	private MobileElement searchBar;
	
	@AndroidFindBy(accessibility="Apple iPhone 11 (64GB) - Black")
	private MobileElement iPhone;
	
	@AndroidFindBy(accessibility="Cart")
	private MobileElement cart;
	
	@AndroidFindBy(id="add-to-cart-button")
	private MobileElement addToCartBtn;
		
	///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button
	public MobileElement getAmazonHome() {
		return amazonHome;
	}

	public HomePage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void searchFor(String item) {
		searchBar.click();
		searchBar.sendKeys(item);
		driver.pressKeyCode(AndroidKeyCode.ENTER);
	}
	
	public void addiPhoneToCart() {
		iPhone.click();
		MobileActionUtil util=new MobileActionUtil();
		util.scrollToElement(driver, "id", "add-to-cart-button");
		addToCartBtn.click();
	}
	
	

}
