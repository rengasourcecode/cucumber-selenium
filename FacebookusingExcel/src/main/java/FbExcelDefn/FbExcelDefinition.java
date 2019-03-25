package FbExcelDefn;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FbExcelDefinition {
	
	static WebDriver driver;

	@Given("user is the facebook login page")
	public void user_is_the_facebook_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
		
	   	}

	
	@Then("user enters the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException, IOException {
		//GettingExcelData obj= new GettingExcelData();
		//obj.gettingdata("username","password");
		//System.out.println(obj.browserurl.toString());
		//System.out.println(obj.browserpassword);
		String browserurl=Gettingusername.Getusername("username");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(browserurl);
		Thread.sleep(1000);


		String browserpassword=Gettingpassword.Getpassword("password");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(browserpassword);
		Thread.sleep(2000);


		
	}

	@Then("user clicks the submit button")
	public void user_clicks_the_submit_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(1000);

		
	}


}
