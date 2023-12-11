package NetBanking.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import NetBanking.pageObjects.loginPage;

public class TC001_Login extends BaseClass {   
	@Test
	public void loginTest() {
		driver.get(baseURL);
		logger.info("URL opened succesfully");
		
		loginPage lp = new loginPage(driver);
		lp.setUserName(username);
		logger.info("Username entered succesfully");
		
		lp.setPassword(password);
		logger.info("Password entered succesfully");
		
		lp.clickLogin();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login successfull");
		}
		
		else {
			Assert.assertTrue(false);
			logger.info("Login failed");
		}
	}
}
