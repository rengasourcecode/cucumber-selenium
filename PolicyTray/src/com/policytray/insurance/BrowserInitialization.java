package com.policytray.insurance;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialization extends PolicyTray {

	static void browserinitiate() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        
        driver.get("https://policytray.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
	}
	
}
