package com.Crm;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
    
	    driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		String PW = driver.getWindowHandle();
		
		driver.findElement(By.id("openwindow")).click();  
		//driver.findElement(By.id("opentab")).click();
		
		Set<String> set1= driver.getWindowHandles();
		
		for ( String b:set1)
		{
			if(!PW.equals(b))
				
			{
				System.out.println(driver.getCurrentUrl());
			//System.out.println(b);
			}
			
			//driver.switchTo().window("Let's Kode It");
		}

	}

}
