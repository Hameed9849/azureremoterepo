package datadrivern;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("C:\\Users\\Hameed\\Desktop\\Data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		System.out.println(s.getCell(0, 1).getContents());
		
		
	}

}
