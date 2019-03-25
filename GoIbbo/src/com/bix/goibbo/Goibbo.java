package com.bix.goibbo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibbo {

	public static void main(String[] args) throws InterruptedException 
	
	{

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		String parent =driver.getWindowHandle();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='get_sign_in']")).click();
		Thread.sleep(1000);
		
		WebElement loginframe=driver.findElement(By.xpath("//*[@id='authiframe']"));
		driver.switchTo().frame(loginframe);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='authMobile']")).sendKeys("9840751113");
		driver.findElement(By.xpath("//*[@id='mobileSubmitBtn']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='authCredentialPassword']")).sendKeys(" DINESHFEB19");
		driver.findElement(By.xpath("//*[@id='authCredentialPasswordSignInBtn']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='mainLinks']//a[@href='/bus/']")).click();

		//driver.findElement(By.xpath("//li[@class='active']//a[@href='/flights/']")).click();
		//driver.switchTo().window(parent);
        //driver.findElement(By.xpath("//span[contains(text(),'Round trip')]")).click();
        
	//	Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys("CHE");
	//	List <String> source= new List<String>();
		
		
		
	}

}
