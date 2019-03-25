package com.datetesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class goibbo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    DesiredCapabilities caps=new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);

		ChromeOptions option=new ChromeOptions();
        option.addArguments("--disable-notifications");
        option.addArguments("--disable-infobars");
        option.merge(caps);

    
	    driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='headerBox col-md-12 col-sm-12 col-xs-12']//ul[@class='mainLinks']//a[@href='/flights/']")).click();
	driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Chennai (MAA)");
	Thread.sleep(1000);
	/*List <WebElement> li= driver.findElements(By.id("react-autosuggest-1"));
	for(int i=0;i<li.size();i++)
	{
		if(li.get(i).getText().equalsIgnoreCase("chennai"))
		{
			li.get(i).click();
		}
	}*/
	driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Mumbai (BOM)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='dF whiteBg col-sm-5 alignItemsCenter  col-md-2 ']//input[@class='inputSrch curPointFlt ']")).click();
	//String month=driver.findElement(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Caption']")).getText();
	//String split[]=month.split(" ");
	for(int i=0;i<12;i++)
	{
		String month=driver.findElement(By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Caption']")).getText();
		String split[]=month.split(" ");
		
		if(split[0].equalsIgnoreCase("april"))
		{
			
			
		}
		else
		{
			driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']//span")).click();
		}
	}
	
	}

}
