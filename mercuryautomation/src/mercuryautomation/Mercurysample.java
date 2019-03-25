package mercuryautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercurysample {

	public static void main(String[] args) 
	{
		
       System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("http://newtours.demoaut.com/");
       
       //LOGGING INTO THE SITE USING TO USERNAME AND PASSWORD
       
       driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
       driver.findElement(By.name("password")).sendKeys("admin");
       driver.findElement(By.name("login")).click();
       // driver.close();
       
       //ONCE ENTERED NAVIGATING INTO ANOTHER LINK
       
       driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();
       
       //LIST ELEMENTS
       
       driver.findElement(By.xpath("//a[@href='mercurycruise.php']")).click();
      // driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a")).click();


       

       
    		   
       

	}

}
