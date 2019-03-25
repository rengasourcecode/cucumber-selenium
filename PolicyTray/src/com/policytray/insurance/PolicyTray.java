package com.policytray.insurance;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class PolicyTray {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException
	
	{
 		BrowserInitialization.browserinitiate();
        
		//MaturityCalculator maturity = new MaturityCalculator();
		//maturity.PremiumAndMaturity();
        //Thread.sleep(2000);

		//SurrenderValueCalculator surrender= new SurrenderValueCalculator();
		//surrender.SurrenderCalculator();
        //Thread.sleep(2000);

 		//LoanCalculator loan = new LoanCalculator();
 		//loan.loancalculation();
 		
 		//ApplyOnline.applyinsurance();
	      
	}	

}
