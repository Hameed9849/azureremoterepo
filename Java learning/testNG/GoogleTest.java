package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_79\\chromedriver.exe");
		driver = new ChromeDriver(); //Launch Chrome browser
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			}
	
  @Test(priority = 1)
  public void GoogleTitle() {
	  
	  String title = driver.getTitle();
	  System.out.println("Page title is " + title);
	  
		  
	  }
  
  @Test(priority = 2)
  public void GoogleLogo() {
	  
	 boolean b = driver.findElement(By.id("hplogo")).isDisplayed();

	
	  	  
		  
	  }
  @AfterMethod
  public void teardown() {
	  
	  driver.quit();
	  //System.out.println("Broser closed");
	  
  }
  
  }

