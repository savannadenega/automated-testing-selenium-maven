package utils;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 * 
 * @author SavannaDenega
 * 
 * Classe para criar o WebDriver, que manipula o navegador.
 * O navegador a ser manipulado e especificado, pois cada tipo utiliza um
 * driver diferente na execucaoo.
 *
 */
public class WebDriverFactoryInstance {

	private static final WebDriverFactoryInstance INSTANCE = new WebDriverFactoryInstance();

	// Windows
	//final String chromeDriverFilePath = System.getProperty("user.dir") + "/browserDrivers/chromedriver.exe";
	// Mac
    final String chromeDriverFilePath = System.getProperty("user.dir") + "/browserDrivers/chromedriver";

    // Outros browsers
	//final String ieDriverServerFilePath = "C:/Java/drivers/IEDriverServer.exe";
	//final String firefoxGeckodriverFilePath = "C:/Program Files (x86)/Mozilla Firefox/geckodriver.exe";

	private WebDriverFactoryInstance() {

	}

	public static final WebDriverFactoryInstance getInstance() {
		return INSTANCE;
	}

	public WebDriver createConfigurationsWebDriver() {
		return setGoogleChromeFactoryDriver();
	}
	
	private WebDriver setGoogleChromeFactoryDriver() {
		System.setProperty("webdriver.chrome.driver", chromeDriverFilePath);
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
		return driver;
	}
	
	//TODO outros browsers

//	private WebDriver firefoxFactoryDriver() {
//		System.setProperty("webdriver.gecko.driver", geckodriver);
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability("marionette", true);
//		WebDriver driver = new FirefoxDriver(capabilities);
//		return driver;
//	}
//
//	private WebDriver internetExplorerDriverFactory() {
//		File file = new File(ieDriverServer);
//		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
//		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//		WebDriver driver = new InternetExplorerDriver(capabilities);
//		return driver;
//	}

}
