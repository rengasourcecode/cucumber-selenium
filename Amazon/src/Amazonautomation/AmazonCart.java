package Amazonautomation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonCart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone x mobile");
		driver.findElement(By.xpath("//*[@value='Go']")).click();
		
	    driver.findElement(By.xpath("//a[@title='Apple iPhone X (Space Grey, 3GB RAM, 64GB Storage, 12 MP Dual Camera, 458 PPI Display)']")).click();
	    Thread.sleep(2000);
	    
	    Set <String> whandles= driver.getWindowHandles();
        System.out.println(whandles);
        
        for(String handles :whandles)
        {
        	if(!parent.equals(handles))
        	{
        		driver.switchTo().window(handles);
        	}
        }
        Thread.sleep(3000);
	    
       //driver.findElement(By.xpath("//li[@title='Click to select Silver']")).click();
       //driver.findElement(By.xpath("//li[@title='Click to select 256GB']")).click();
	   //Thread.sleep(2000);

       driver.findElement(By.xpath("//div//a//i[@class='a-icon a-accordion-radio a-icon-radio-inactive']")).click();
       
       
       WebElement opt1= driver.findElement(By.xpath("//*[@id='buyBackDropDown1Id']//span//span"));
       opt1.click();
       
    //   WebElement selectopt=driver.findElement(By.xpath("//*[@id='buyBackDropDown1_1']"));
      // selectopt.click();
       
       Thread.sleep(4000);
     
       List <WebElement> li=driver.findElements(By.xpath("//*[@class='a-nostyle a-list-link']//a"));
       for(int i=0;i<li.size();i++)
       {
    	  System.out.println(li.get(i).getText()); 
    	  if(li.get(i).getText().trim().equals("Apple"))
    	  {
    		  li.get(i).click();
    	  }
       }
       
      /* WebElement opt2= driver.findElement(By.xpath("//*[@id='AppleId']//span//span"));
       opt2.click();
       
       WebElement selectopt2=driver.findElement(By.xpath("//*[@id='Apple_24']"));
       selectopt2.click();
       
       Thread.sleep(4000);
       
       driver.findElement(By.xpath("//*[@id='buyBackIMEITextInput']")).sendKeys("355417072154062");
       driver.findElement(By.xpath("//*[@id='buyBackApplyButton']//span//input")).click();
       Thread.sleep(4000);
	   driver.findElement(By.xpath("//*[@id='buyBackBuyNowButton']//span//input")).click();
	   
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("9840751113");
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("DINESHFEB19");
	   driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();

	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//*[@id='address-book-entry-0']//div[2]//span//a")).click();
	   
	   Thread.sleep(4000);
	  // driver.findElement(By.xpath("//*[@id='pp-0O-74']")).sendKeys("791");
	   //driver.findElement(By.xpath("")).click();
*/
	   

	   
	   

	   

       
     /*  if(driver.findElement(By.xpath("//*[@id=/buyBackIMEIUpdate']//div//div")).isDisplayed())
       {
    	   driver.findElement(By.xpath("//*[@id='buyBackBuyNowButton']//span//input")).click();
       }
       List <WebElement> elements = opt1.findElements(By.xpath("//*[@id='a-popover-4']//div//div//ul"));

      
       for(int i=0;i<elements.size();i++)
       {
    	  
    		System.out.println(elements.get(i).getText());
    	  
    	   
       }   
    	 */ 
    	   
       
      /* 
       for(int i=0;i<elements.size();i++)
       {
    	   if(elements.get(i).getText().equals("Apple"))
    	   {
    		   elements.get(i).click();
    	  
    	   }
       }
       Thread.sleep(1000);
      
       List <WebElement> e2= driver.findElements(By.xpath("//*[@id='AppleId']/span/span/span"));
     
       
       for(int i=0;i<e2.size();i++)
       {
    	   if(e2.get(i).getText().equals("iPhone 6S | 16 GB"))
    	   {
    		   e2.get(i).click();
    	  
    	   }
       }
	*/
      
	    
	 
     //  driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();

        

        
	}

}
