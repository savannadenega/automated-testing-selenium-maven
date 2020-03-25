package utils;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @author SavannaDenega
 *
 */
public class WebDriverInstance {

	protected static WebDriver driver = null;
	protected static String baseUrl = System.getProperty("baseUrl",
			"http://www.practiceselenium.com/");

	@BeforeClass
	public static void setUp() throws Exception {
		driver = WebDriverFactoryInstance.getInstance().createConfigurationsWebDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.get(baseUrl);
	}

//	@AfterClass
//	public static void tearDown() throws Exception {
//		driver.close();
//		driver.quit();
//	}
	
	public static void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
