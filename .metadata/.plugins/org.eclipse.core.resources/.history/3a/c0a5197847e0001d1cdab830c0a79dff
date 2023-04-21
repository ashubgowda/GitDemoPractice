package stockmarket.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="userid")
	WebElement userId;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	public MobileAppCode loginApplication(String userID, String pwd) {
		userId.sendKeys(userID);
		password.sendKeys(pwd);
		submit.click();
		MobileAppCode appCode = new MobileAppCode(driver);
		return appCode;
		
	}
	public void goTo() {
		driver.get("https://kite.zerodha.com/");
		
	}
	public void test() {
		System.out.println("I am landing page");
	}
}
