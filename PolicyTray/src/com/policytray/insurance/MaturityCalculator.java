package com.policytray.insurance;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class MaturityCalculator extends PolicyTray {

	
	void PremiumAndMaturity() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
        
        driver.get("https://policytray.com/");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//li//a[@href='PremiumMaturity.aspx']")).click();
        Thread.sleep(2000);

        
        driver.findElement(By.xpath("//div//input[@maxlength='19']")).sendKeys("500000");
        Thread.sleep(1000);
        
        Select s= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_Calculator_DDLPlan']")));
        s.selectByVisibleText("Jeevan Labh - 10 yrs");
        Thread.sleep(1000);

        /* List<WebElement> l1=s.getOptions();
        for(int i=0;i<l1.size();i++)
        {
        	if(l1.get(i).getText().equalsIgnoreCase("Jeevan Labh - 10 yrs"))
        	{
        		l1.get(i).click();
        	}
        }
       */ 
        
        Select s1= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_Calculator_DDLTerm']")));
        s1.selectByVisibleText("16");
        Thread.sleep(1000);
        
        WebElement checkbox1=  driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Calculator_chkDAB']"));
        if(checkbox1.isEnabled()==false)
         {
    	    checkbox1.click();
          } Thread.sleep(1000);
      
        driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Calculator_TxtName']")).sendKeys("RENGANATHAN");
        driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Calculator_TxtMobile']")).sendKeys("9840751113");
        Thread.sleep(3000);
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src, new File("D:\\cucumberscreenshots\\policytray\\maturitycalculator\\maturity1.png"));
        Thread.sleep(2000);


        Select s2= new Select(driver.findElement(By.xpath("//td[@class='style4']//*[@id='ContentPlaceHolder1_Calculator_DDLDate']")));
        s2.selectByValue("19");
        
        Select s3= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_Calculator_DDLMonth']")));
        s3.selectByValue("02");
        
        Select s4= new Select(driver.findElement(By.xpath("//select[@id='ContentPlaceHolder1_Calculator_DDLYear']")));
        s4.selectByValue("1989");
        Thread.sleep(2000);
        
//        WebElement checkbox2=  driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Calculator_chkTermsConditions']"));
//        if(checkbox2.isEnabled()==false)
//         {
//    	    checkbox2.click();
//          } Thread.sleep(1000);
//      
        driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_Calculator_BtnSave']")).click();
        Thread.sleep(4000);
        
        File src2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src2, new File("D:\\cucumberscreenshots\\policytray\\maturitycalculator\\maturity2.png"));

        
        
	}	


		
	}

