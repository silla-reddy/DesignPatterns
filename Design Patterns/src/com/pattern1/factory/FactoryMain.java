package com.pattern1.factory;

public class FactoryMain {
	/*
	Factory Pattern
	
	Purpose:
		The Factory Pattern is a creational design pattern that helps create objects dynamically instead of directly using constructors.
		In test automation, it's often used to manage WebDriver instances or create test data objects.
		
	How It Works:
	A factory class(OperatingSystemFactory) provides a centralized method(getInstance) to create and return objects based on input parameters.
	
	Example: WebDriverFactory
	
	public class WebDriverFactory {
    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Invalid browser type: " + browserType);
        }
    	}
	}
	
	
		*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatingSystemFactory osf=new OperatingSystemFactory();
//		InterfaceOS os=osf.getInstance("open source");
		InterfaceOS os=osf.getInstance("secured");
		os.spec();
	}

}

/*
 * 
 * 		WEBDRIVER FACTORY
 * 
 * 
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeOptions;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.firefox.FirefoxOptions;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.remote.RemoteWebDriver;
		import java.net.MalformedURLException;
		import java.net.URL;
		
		public class WebDriverFactory {
		    public static WebDriver getDriver(String browserType) {
		        WebDriver driver;
		
		        switch (browserType.toLowerCase()) {
		            case "chrome":
		                ChromeOptions chromeOptions = new ChromeOptions();
		                chromeOptions.addArguments("--start-maximized");
		                chromeOptions.addArguments("--disable-notifications");
		                chromeOptions.setHeadless(false);  // Change to true for headless mode
		                driver = new ChromeDriver(chromeOptions);
		                break;
		
		            case "firefox":
		                FirefoxOptions firefoxOptions = new FirefoxOptions();
		                firefoxOptions.setHeadless(false);  // Change to true for headless mode
		                driver = new FirefoxDriver(firefoxOptions);
		                break;
		
		            case "remote":
		                try {
		                    DesiredCapabilities capabilities = new DesiredCapabilities();
		                    capabilities.setBrowserName("chrome");  // Change to required browser
		                    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		                } catch (MalformedURLException e) {
		                    throw new RuntimeException("Invalid Remote WebDriver URL", e);
		                }
		                break;
		
		            default:
		                throw new IllegalArgumentException("Invalid browser type: " + browserType);
		        }
		
		        return driver;
		    }
		}
 * 
 * 
 * 		
 * 		USING FACTORY IN TEST CLASS
 * 		
 * 		WebDriver driver = WebDriverFactory.getDriver("chrome");
 * 
 * 
 */
