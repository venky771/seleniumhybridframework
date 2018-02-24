package GigaCloud;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabs {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities dc= DesiredCapabilities.firefox();
		//dc.setCapability("version", "5");
		//dc.setCapability("platform", "XP");

	WebDriver driver = new RemoteWebDriver( new URL("http://ondemand.saucelabs.com:80"),  dc);

	driver.get("http://ebay.com");
	System.out.println(driver.getTitle());
	}

}
