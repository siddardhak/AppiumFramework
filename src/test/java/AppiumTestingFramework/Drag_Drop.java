package AppiumTestingFramework;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;


public class Drag_Drop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		TouchAction action =new TouchAction(driver);
		WebElement source=driver.findElementsByClassName("android.view.View").get(0);
		WebElement dest =driver.findElementsByClassName("android.view.View").get(2);
		action.longPress(longPressOptions().withElement(element(source))).moveTo(element(dest)).release().perform();

		// action.longPress(element(source)).moveTo(element(dest)).release().perform();
		
		// if duration not needed above orelse used in code..



	}

}
