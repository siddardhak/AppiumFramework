package AppiumTestingFramework;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;


public class Swiping extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		
		//identify attribute
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		driver.findElementByXPath("//*[@content-desc='5']").click();
		TouchAction touchaction= new TouchAction(driver);
		WebElement time=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement timeq=driver.findElementByXPath("//*[@content-desc='45']");
		touchaction.longPress(longPressOptions().withElement(element(time)).withDuration(ofSeconds(2))).moveTo(element(timeq)).release().perform();
	}

}
