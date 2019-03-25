package com.datetesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    DesiredCapabilities caps=new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);

		ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        option.addArguments("--disable-infobars");
        option.merge(caps);

    
	    driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("che");
		Thread.sleep(3000);
		
		List <WebElement> li1= driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		Thread.sleep(1000);
		for(int i=0;i<li1.size();i++)
		{
			if(li1.get(i).getText().equalsIgnoreCase("chennai"))
			{
				li1.get(i).click();
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("go");
		List <WebElement> li2= driver.findElements(By.xpath("//ul[@id='ui-id-2']//li"));
		Thread.sleep(1000);
		for(int i=0;i<li2.size();i++)
		{
			if(li2.get(i).getText().equalsIgnoreCase("goa"))
			{
				li2.get(i).click();
			}
		}
		Thread.sleep(1000);
		
		/*driver.findElement(By.xpath("//div[@class='inputM modify_search']//input[@id='hp-widget__depart']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='inputM modify_search']//input[@id='hp-widget__depart']")).click();
*/
	}

}
