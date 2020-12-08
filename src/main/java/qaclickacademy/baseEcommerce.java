package qaclickacademy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseEcommerce {

public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {
	
	FileInputStream fis = new FileInputStream("C:\\Users\\IBAdmin\\Eclipse-Test\\MavenJava\\src\\main\\java\\qaclickacademy\\global.properties");
	Properties props = new Properties();
	props.load(fis);
	props.get(appName);
		
	
	
		File f  = new File("src");
		File fs = new File(f,(String) props.get(appName));
	
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		//AndroidDriver driver  = new AndroidDriver(new URL(�http://127.0.0.1:4723/wd/hub�),cap)
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
		           
	}

}
