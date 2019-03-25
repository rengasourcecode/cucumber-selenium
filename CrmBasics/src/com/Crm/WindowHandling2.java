package com.Crm;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling2 {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
    
	    driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        String pwindow= driver.getWindowHandle();

        System.out.println(pwindow);
        
        driver.findElement(By.xpath("//*[@id='openwindow']")).click();
        Thread.sleep(2000);
        
        Set <String> handles = driver.getWindowHandles();

        System.out.println(handles);

        for (String handle1 : driver.getWindowHandles())
        {
        	System.out.println(handle1);
        	if (!pwindow.equalsIgnoreCase(handle1))
        	{
                driver.switchTo().window(handle1);

        	}
        	
         }
        

        System.out.println(driver.getCurrentUrl());
       // String cwindow= driver.getWindowHandle();
        //driver.switchTo().window(cwindow);


       // Thread.sleep(2000);
        
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='fpapi_comm_iframe']")));
        Thread.sleep(2000);
        
        driver.findElement(By.id("search-courses")).sendKeys("abc");
        driver.findElement(By.xpath("//button[@id='search-course-button']")).click();
        
                Thread.sleep(3000);
                driver.quit();
     //   driver.switchTo().window(pwindow);
        
        
        
        

        

        

	

	}

}
