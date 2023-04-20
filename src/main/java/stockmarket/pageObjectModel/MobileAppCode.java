package stockmarket.pageObjectModel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileAppCode {

	WebDriver driver;

	public MobileAppCode(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@label='Mobile App Code']")
	WebElement appCode;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public void submitAppCode() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		reader.readLine();
		submit.click();
	}

}
