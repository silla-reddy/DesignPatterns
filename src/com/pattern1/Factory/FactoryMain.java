package com.pattern1.Factory;

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
