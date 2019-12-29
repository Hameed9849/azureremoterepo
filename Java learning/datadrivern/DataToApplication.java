package datadrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class DataToApplication {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream("C:\\Users\\Hameed\\Desktop\\Data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		WebDriver driver = new FirefoxDriver();
		
		
		
	}

}
