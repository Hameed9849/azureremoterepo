package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hameed\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("email")).sendKeys("hameed");
		driver.findElement(By.id("email")).clear();
		WebElement uid = driver.findElement(By.id("email"));
		uid.sendKeys("hanna");
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("123456");
		*/
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		int i;
		for (i=0; i<Links.size(); i++) {
			System.out.println(Links.get(i).getText());
			
		}

	}

}
