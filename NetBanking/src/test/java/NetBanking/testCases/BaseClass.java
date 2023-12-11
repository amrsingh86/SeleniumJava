package NetBanking.testCases;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	// ALL COMMON STEPS WILL COME UNDER BASE CLASS
	
	public String baseURL = "https://demo.guru99.com/v4/index.php";
	public String username = "mngr542104";
	public String password = "anYjEmY";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver =new ChromeDriver();
		
		BasicConfigurator.configure();
		logger = Logger.getLogger("netBanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
