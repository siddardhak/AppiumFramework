package AppiumTestingFramework;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base{
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		File file=new File("src/test/java");
		File filename=new File(file,"ApiDemos-debug.apk");
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"idiot");
		dc.setCapability(MobileCapabilityType.APP,filename.getAbsolutePath());
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		return driver;

		
		
	}
}