package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RSATest 
{
	@Test
	public void homePageCheck() throws MalformedURLException, URISyntaxException, InterruptedException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setBrowserName("safari");
		//caps.setPlatform(Platform.MAC);
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.230:4444").toURL(),caps);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
