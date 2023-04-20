package stockmarket.TestComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import stockmarket.pageObjectModel.LandingPage;

public class BaseTest {
	public WebDriver driver;
	public LandingPage landingPage;

	
	public WebDriver initializeDriver() throws IOException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\main\\java\\stockmarket\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// Firefox driver
		} else if (browserName.equalsIgnoreCase("edge")) {
			// Edge driver
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		return driver;
	}

	@BeforeMethod
	public LandingPage launchApplication() throws IOException {
		driver= initializeDriver();
		landingPage = new LandingPage(driver);
		landingPage.goTo();
		
		return landingPage;

	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	

}
