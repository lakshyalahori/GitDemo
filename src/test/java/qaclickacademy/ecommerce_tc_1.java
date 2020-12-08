package qaclickacademy;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc_1 extends baseEcommerce {

	public static void main(String[] args) throws IOException {
	
		AndroidDriver<AndroidElement>	driver = capabilities("GeneralStoreApp");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Test");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

	}

}
