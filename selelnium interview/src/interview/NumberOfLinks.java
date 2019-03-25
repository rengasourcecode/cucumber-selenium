package interview;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class NumberOfLinks {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	/*	List <WebElement> li= driver.findElements(By.xpath("//a"));
		System.out.println(li.size());
		
		for (WebElement li2:li)
		{
			System.out.println(li2.getAttribute("href"));
			System.out.println(li2.getText());
		}*/
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(src, new File("C:/selenium/error.png"));


	}

}
