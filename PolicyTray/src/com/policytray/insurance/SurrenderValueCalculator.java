package com.policytray.insurance;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SurrenderValueCalculator extends PolicyTray{
	
	void SurrenderCalculator() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        
        driver.get("https://policytray.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li//a[@href='SurrenderValueCalculator.aspx']")).click();
        driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_txtName']")).sendKeys("SALIM");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@name='ctl00$ContentPlaceHolder1$txtMobile']")).sendKeys("9597024829");
        Select s1=new Select(driver.findElement(By.xpath("//td//select[@id='ddlPlan']")));
        s1.selectByValue("88");
        Thread.sleep(1000);
        
        
        Select s2= new Select(driver.findElement(By.xpath("//td//select[@id='ddlTerm']")));
        s2.selectByValue("20");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//td//input[@id='ContentPlaceHolder1_txtInstallments']")).sendKeys("20");
        Thread.sleep(1000);
        
        Select s3= new Select(driver.findElement(By.xpath("//td//select[@id='ContentPlaceHolder1_ddlMode']")));
        s3.selectByValue("2");
        Thread.sleep(3000);
        
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("D:\\cucumberscreenshots\\policytray\\surrendervalue\\surrender1.png"));
        

        
        driver.findElement(By.xpath("//td//input[@id='ContentPlaceHolder1_txtPremium']")).sendKeys("5000");
        Thread.sleep(1000);

        Select s4= new Select(driver.findElement(By.xpath("//td//select[@id='ddlPolicyYear']")));
        s4.selectByValue("10");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//td//input[@id='ContentPlaceHolder1_btnGetLoanValue']")).click();
        Thread.sleep(4000);

        
        File src2= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src2, new File("D:\\cucumberscreenshots\\policytray\\surrendervalue\\surrender2.png"));
        

        
	}

}
