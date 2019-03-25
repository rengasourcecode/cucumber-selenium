package seleniumtask;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestingAllLinksFacebook {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
	//	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	/*	driver.findElement(By.cssSelector("input#email")).sendKeys("rengasourav@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("JINGU1989");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label#loginbutton")).click(); */
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[1]","D:\\cucumberscreenshots\\facebook\\signup.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[2]","D:\\cucumberscreenshots\\facebook\\log-in.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[3]","D:\\cucumberscreenshots\\facebook\\messenger.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[4]","D:\\cucumberscreenshots\\facebook\\facebook-lite.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[5]","D:\\cucumberscreenshots\\facebook\\find-friends.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[6]","D:\\cucumberscreenshots\\facebook\\people.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[7]","D:\\cucumberscreenshots\\facebook\\profile.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[8]","D:\\cucumberscreenshots\\facebook\\pages.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[9]","D:\\cucumberscreenshots\\facebook\\page-categories.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[10]","D:\\cucumberscreenshots\\facebook\\places.png");
		Thread.sleep(1000);
		
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[11]","D:\\cucumberscreenshots\\facebook\\games.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[12]","D:\\cucumberscreenshots\\facebook\\locations.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[13]","D:\\cucumberscreenshots\\facebook\\market-place.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[14]","D:\\cucumberscreenshots\\facebook\\groups.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[15]","D:\\cucumberscreenshots\\facebook\\instagram.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[16]","D:\\cucumberscreenshots\\facebook\\local.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[17]","D:\\cucumberscreenshots\\facebook\\fund-raisers.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[18]","D:\\cucumberscreenshots\\facebook\\events.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[19]","D:\\cucumberscreenshots\\facebook\\about.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[20]","D:\\cucumberscreenshots\\facebook\\create-ad.png");
		Thread.sleep(1000);
		
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[21]","D:\\cucumberscreenshots\\facebook\\create-page.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[22]","D:\\cucumberscreenshots\\facebook\\developers.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[23]","D:\\cucumberscreenshots\\facebook\\careers.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[24]","D:\\cucumberscreenshots\\facebook\\privacy.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[25]","D:\\cucumberscreenshots\\facebook\\cookies.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[26]","D:\\cucumberscreenshots\\facebook\\add-choices.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[27]","D:\\cucumberscreenshots\\facebook\\terms.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[28]","D:\\cucumberscreenshots\\facebook\\account-security.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[29]","D:\\cucumberscreenshots\\facebook\\login-help.png");
		Thread.sleep(1000);
		validitycheck("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']//li[30]","D:\\cucumberscreenshots\\facebook\\help.png");
		Thread.sleep(1000);

}
	public static void validitycheck(String xpath,String fpath) throws InterruptedException, IOException
	{
		driver.findElement(By.xpath(xpath)).click();
		Thread.sleep(4000);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(fpath));
		Thread.sleep(1000);		
		driver.navigate().back();
		Thread.sleep(2000);
		
	}


}
