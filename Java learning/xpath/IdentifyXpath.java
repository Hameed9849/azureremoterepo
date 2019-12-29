package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyXpath {

	public static void main(String[] args) {
		
		//identify the location of the Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hameed\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//find element by xpath
		
		/*
		 * driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[1]/input"
		 * )).sendKeys("hanna.shaik"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[2]/input"
		 * )).sendKeys("Honey@123"); driver.findElement(By.xpath(
		 * "/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input"
		 * )).click();
		 */
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hanna.shaik");
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Honey@123");
	driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();
	
				

	}

}
