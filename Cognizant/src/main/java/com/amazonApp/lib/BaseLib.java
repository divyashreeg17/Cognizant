package com.amazonApp.lib;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.amazonApp.init.GlobalVariables;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import io.appium.java_client.android.AndroidDriver;

public class BaseLib {
	public  GlobalVariables gv = new GlobalVariables();
	public static ExtentReports extentreports;
	public static ExtentTest extenttest;
	public static ExtentHtmlReporter extenthtmlreporter;
	public  String testCaseName;
	
	@BeforeClass
	public void _LaunchApp() throws MalformedURLException
	{
		gv.capabilities = new DesiredCapabilities();
		gv.capabilities.setCapability("deviceName", gv.deviceName);
		gv.capabilities.setCapability("platformName", gv.platformName);
		gv.capabilities.setCapability("platformVersion", gv.platforVersion);
		gv.capabilities.setCapability("automationName", gv.automationName);
		gv.capabilities.setCapability("appPackage", gv.appPackage);
		gv.capabilities.setCapability("appActivity", gv.appActivity);
		gv.capabilities.setCapability("UDID", gv.UDID);
		gv.capabilities.setCapability("fullReset", false);
		gv.capabilities.setCapability("noReset", true);
		gv.capabilities.setCapability("appWaitDuration", 180000);
		gv.capabilities.setCapability("autoGrantPermissions", true);
		gv.capabilities.setCapability("autoAcceptAlerts", true);
		System.out.println("http://127.0.0.1:"+gv.port+"/wd/hub");
		gv.driver = new AndroidDriver(new URL("http://127.0.0.1:"+gv.port+"/wd/hub"), gv.capabilities);
		gv.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
			
	}
	
	
	
	@AfterClass
	public void shutDownApp()
	{
	
			
	}
	
	

}
