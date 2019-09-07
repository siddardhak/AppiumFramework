package AppiumTestingFramework;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;

class Second extends Base{
	
	public static void main(String [] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		//identify the attribute
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//checks clickable is false 
		//identifying the property
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(false)").size());
		
		//Popup
		driver.findElementsByClassName("android.widget.TextView").get(9).click();
		
		// Tap gesture
		
		TouchAction touchactions=new TouchAction(driver);
		WebElement list=driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		touchactions.tap(tapOptions().withElement(element(list))).perform();
		WebElement list1=driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		touchactions.longPress(longPressOptions().withElement(element(list1))).release().perform();
		
		//findElementByAndroidUiAutomator("new UiSelector().property")
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		

		
	}
}