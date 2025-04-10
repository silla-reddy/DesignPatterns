package com.pattern3.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		SingletonClass sc1=SingletonClass.getInstance();
		SingletonClass sc2=SingletonClass.getInstance();
		System.out.println(sc1==sc2);
	}

}

/*
 * The Singleton pattern ensures that only one instance of a class is created throughout the execution of a test suite.
 * 
	🔹 Where is Singleton Used in Automation?
	The Singleton pattern is commonly used for:
	✅ WebDriver instance management (Ensuring only one browser session is active)
	✅ Logger instance (Avoid duplicate loggers across tests)
	✅ Configuration file reader (Avoid reading properties multiple times)
	
	✅ Why Use Singleton for WebDriver?
		Feature						Without Singleton						With Singleton
		Performance					Creates multiple drivers				Uses one driver instance
		Memory Usage				High									Optimized
		Session Management			Multiple browser windows open			Single session maintained
		
		
	✅ Example: Singleton WebDriver
		
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class WebDriverSingleton {
		    private static WebDriver driver;
		
		    private WebDriverSingleton() { } // Private constructor to prevent instantiation
		
		    public static WebDriver getDriver() {
		        if (driver == null) {  // Initialize only if not already created
		            driver = new ChromeDriver();
		        }
		        return driver;
		    }
		
		    public static void quitDriver() {
		        if (driver != null) {
		            driver.quit();
		            driver = null;  // Reset instance for future use
		        }
		    }
		}
		
	✅ How to Use in Tests
	
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.BeforeTest;
		import org.openqa.selenium.WebDriver;
		
		public class TestExample {
		    WebDriver driver;
		
		    @BeforeTest
		    public void setUp() {
		        driver = WebDriverSingleton.getDriver();
		        driver.get("https://www.example.com");
		    }
		
		    @AfterTest
		    public void tearDown() {
		        WebDriverSingleton.quitDriver();
		    }
		}

 * 
 * 
 */



