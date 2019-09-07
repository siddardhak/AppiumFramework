package AppiumTestingFramework;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class First extends Base{
	public static void main(String args[]) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Preferences from XML']").click();
		driver.findElementByXPath("(//android.widget.CheckBox)[2]").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		//driver.findElementsByXPath(using).get[].click();
	    driver.findElementByClassName("android.widget.EditText").sendKeys("dog");
	    driver.findElementById("android:id/button1").click();


		
	}
	
	
}