package com.Crm;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindows 
{

	public static void main(String[] args) throws InterruptedException  {

		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
    
	    driver.get("https://www.amazon.in/S");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
        String pwindow= driver.getWindowHandle();

        System.out.println(pwindow);
        
        
		Actions act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Get a Call Back']"))).build().perform();
        driver.findElement(By.xpath("//*[@class='callbackList']//li[1]")).click();

        Thread.sleep(2000);
        driver.switchTo().window(pwindow);

		act.moveToElement(driver.findElement(By.xpath("//a[@title='Get a Call Back']"))).build().perform();
        driver.findElement(By.xpath("//*[@class='callbackList']//li[2]")).click();

        Thread.sleep(2000);
        
        Set <String> handles = driver.getWindowHandles();

       // System.out.println(handles);

        for (String handle1 : handles)
        {
        	System.out.println(handle1);
        	System.out.println(driver.getTitle());
        	System.out.println(driver.getCurrentUrl());
        	/*if (!pwindow.equalsIgnoreCase(handle1))
        	{
                driver.switchTo().window(handle1);

        	}*/
        	
         }
        

	}

}
