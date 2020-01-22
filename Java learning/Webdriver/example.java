package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {
	public static void main (String []args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		
	driver.findElement(By.id("email")).sendKeys("Hameedullah");
	boolean ab = driver.findElement(By.id("pass")).isDisplayed();
	if (ab==true)
		System.out.println("id pass is displayed");
	else System.out.println("id pass is not displayed");
	
	driver.findElement(By.id("pass")).sendKeys("hameed");

	String a = driver.findElement(By.id("email")).getAttribute("class");
	System.out.println("Attribute of email: " + a);
		/*System.out.println("TagName:  " + driver.findElement(By.id("email")).getTagName());
		System.out.println("size: " + driver.findElement(By.id("email")).getSize());
		System.out.println("Location:  " + driver.findElement(By.id("email")).getLocation());
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getWindowHandles());
		
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		*/
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().window().getSize();
		
		
		
		
	}}