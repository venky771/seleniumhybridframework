package GigaCloud;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonLibrary {

	public static WebDriver driver;
	public Properties prop;

public WebDriver initializeDriver() throws IOException
	{
	
	prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\venki\\GTEP\\src\\test\\java\\GigaCloud\\data.properties");
	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);
	
			if(browserName.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\ChromeDriver\\chromedriver.exe");
			 driver= new ChromeDriver();
					
		}
		else if (browserName.equals("firefox"))
		{
			 driver= new FirefoxDriver();
			
		}
		else if (browserName.equals("IE"))
			{
			
			}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

	}
	
}
