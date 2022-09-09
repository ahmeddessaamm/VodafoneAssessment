package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBasis {
	
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			String chromepath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		
		
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			String edgepath = System.getProperty("user.dir")+"\\drivers\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", edgepath);
			driver = new EdgeDriver ();
		}
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.de/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
	@AfterClass
	public void stopDriver() {
		
	//driver.quit();	
	}
	@AfterMethod
	
	public void takeSSonFailure (ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed !! ");
			System.out.println("Taking ScreenShot .... ");
			Helper.caputreScreenshot(driver, result.getName());

			
		}
		
		
	}
}

