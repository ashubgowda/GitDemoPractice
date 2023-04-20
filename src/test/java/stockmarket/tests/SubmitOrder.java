package stockmarket.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import stockmarket.TestComponent.BaseTest;
import stockmarket.pageObjectModel.MobileAppCode;

public class SubmitOrder extends BaseTest {
	
	@Test
	public void submitOrder() throws IOException {
		
		MobileAppCode appcode = landingPage.loginApplication("TSW202", "Dmat@1234");
		appcode.submitAppCode();
		
	}

}
