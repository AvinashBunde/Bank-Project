package Utilities.BankProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\avina\\OneDrive\\Drivers\\chromedriver122.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/Security/SEC_V1/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}
