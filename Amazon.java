package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Amazon {
@Test
public void test() throws MalformedURLException{
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("BROWSER_NAME", "Android");
	cap.setCapability("VERSION", "4.2.2");
	cap.setCapability("deviceName", "Huawei");
	cap.setCapability("platformName", "Android");
	cap.setCapability("appPackage", "com.amazon.mShop.android.shopping");
	cap.setCapability("appActivity", "com.amazon.mShop.history.HistoryActivity");
	
	WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
	WebElement srch = driver.findElement(By.className("android.widget.EditText"));
	srch.click();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	//srch.sendKeys("Samsung");
	
	driver.quit();

}
}
