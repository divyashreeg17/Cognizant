package com.amazonApp.init;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazonApp.lib.GenericLibrary;

import io.appium.java_client.android.AndroidDriver;

public class GlobalVariables {
//	Global Variables
	public AndroidDriver driver;
	public DesiredCapabilities capabilities;
	
//	DesiredCapabilities Variables
	public int port =Integer.parseInt(GenericLibrary.getProprtyValue(Constants.DCfile, "port"));
	public String deviceName=GenericLibrary.getProprtyValue(Constants.DCfile, "devicename");
	public String platformName=GenericLibrary.getProprtyValue(Constants.DCfile, "platformname");
	public String platforVersion=GenericLibrary.getProprtyValue(Constants.DCfile, "platformversion");
	public String automationName=GenericLibrary.getProprtyValue(Constants.DCfile, "automationname");
	//public String app=GenericLibrary.getProprtyValue(Constants.DCfile, "app");
	public String appPackage=GenericLibrary.getProprtyValue(Constants.DCfile, "apppackage");
	public String appActivity=GenericLibrary.getProprtyValue(Constants.DCfile, "appactivity");
	public String UDID=GenericLibrary.getProprtyValue(Constants.DCfile, "udid");
	
	
//	User Credentials
	public String UserContNum=GenericLibrary.getProprtyValue(Constants.UserDetails, "contactNum");
	public String UserPwd=GenericLibrary.getProprtyValue(Constants.UserDetails, "password");
	
}
