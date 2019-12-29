package datadrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class RdWr {

	public static void main(String[] args) throws Exception {
		
		// Identify the excel sheet
		FileInputStream f = new FileInputStream("C:\\Users\\Hameed\\Desktop\\ReadData.xls");
	//	FileOutputstream fo = new FileOutputstream("C:\\Users\\Hameed\\Desktop\\createworkbook.xls");
		//Open the excel workbook
		Workbook wb = Workbook.getWorkbook(f);
		Sheet S = wb.getSheet("Sheet1");
		System.out.println(S.getCell(0, 1).getContents());
		
		

	}

}
