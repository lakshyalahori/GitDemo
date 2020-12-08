package qaclickacademy;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		File f  = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//AndroidDriver driver  = new AndroidDriver(new URL(�http://127.0.0.1:4723/wd/hub�),cap)
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
		           
	}
	
	
	/*
	public static void main(String args[]) throws MalformedURLException {
		
		File f  = new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//AndroidDriver driver  = new AndroidDriver(new URL(�http://127.0.0.1:4723/wd/hub�),cap)
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		           
	}
*/
}
