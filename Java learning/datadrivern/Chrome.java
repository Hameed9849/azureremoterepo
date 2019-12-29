package datadrivern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Hameed\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	
	
	

	}

}
