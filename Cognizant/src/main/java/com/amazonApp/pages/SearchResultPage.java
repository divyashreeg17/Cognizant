package com.amazonApp.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchResultPage {
	AndroidDriver driver;
	public void SearchResultPage(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Vu 164 cm (65 inches) 4K Ultra HD Smart Android LED TV | With 5-Hotkeys 65UT (Black... 4.6 out of 5 stars 130 ₹49,999M.R.P.: ₹75,000Save ₹25,001 (33%) FREE delivery by Thu, 25 Jun, 8:00 AM - 2:00 PM\"]")
	private MobileElement tvDetails;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Vu 164 cm (65 inches) 4K Ultra HD Smart Android LED TV | With 5-Hotkeys 65UT (Black... 4.6 out of 5 stars 130 ₹49,999M.R.P.: ₹75,000Save ₹25,001 (33%) FREE delivery by Thu, 25 Jun, 8:00 AM - 2:00 PM\"]/android.view.View[1]")
	private MobileElement tvDescription;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Vu 164 cm (65 inches) 4K Ultra HD Smart Android LED TV | With 5-Hotkeys 65UT (Black... 4.6 out of 5 stars 130 ₹49,999M.R.P.: ₹75,000Save ₹25,001 (33%) FREE delivery by Thu, 25 Jun, 8:00 AM - 2:00 PM\"]/android.view.View[3]/android.view.View")
	private MobileElement price;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.view.View/android.view.View/android.view.View")
	private MobileElement btnBuyNow;
	
	public String getDescriptionFromSearchResultPage() {
		return tvDescription.getText();
	}
	
	public String getPrice() {
		return price.getText();
	}
	
	public void selectItem() {
		tvDetails.click();
	}
	
	public void clickBuyNow() {
		btnBuyNow.click();
	}
}
