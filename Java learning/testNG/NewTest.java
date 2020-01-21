package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void main() {
	  
	  System.out.println("Test case 1 pass");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("AfterMethod"); 
  }

}
