package com.busbooking;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbuss {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("src")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("che");
		Thread.sleep(2000);
		List <WebElement> li1= driver.findElements(By.xpath("//ul[@class='autoFill']//li"));
		
		for(int i=0;i<li1.size();i++)
		{
			if(li1.get(i).getText().equalsIgnoreCase("Chengannur"))
			{
				li1.get(i).click();
			}
		}
	
	}

}
