package genericLib;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities driverUtilities = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHIVA REDDY\\OneDrive\\Desktop\\Selenium Folder\\Selenium Jar Files\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--incognito");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(pdata.getPropertyFileData("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void CloseApp(ITestResult result) throws IOException
	{
		int status = result.getStatus();
		String name = result.getName();
		if(status==2)
		{
			photo p = new photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
	}
	
}
