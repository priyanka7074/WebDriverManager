package WM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		//If you want to use a specific version of google chrome then use below code
		WebDriverManager.chromedriver().version("2.26").setup();
		driver = new FirefoxDriver();
		}
	
	@Test
	public void freeCRMTest() {
		driver.get("https://www.crmpro.com/index.html");
		System.out.println(driver.getTitle());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
