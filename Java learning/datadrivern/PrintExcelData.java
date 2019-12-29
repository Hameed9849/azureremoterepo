package datadrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Sheet;
import jxl.Workbook;

public class PrintExcelData {

	public static void main(String[] args) throws Exception {
		// Find cell number of a perticular string
		FileInputStream f = new FileInputStream("C:\\Users\\Hameed\\Desktop\\Data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		int i; int j;
		
		int c = s.getColumns(); int r=s.getRows();
		
		for (i=0; i<c; i++) {
			for (j=0; j<r; j++) {
				
				String val=s.getCell(i, j).getContents();
				if(val.equals("Hameed")==true)
					System.out.println(i+ "_"  + j);
				
				
			}
		}
		
		
		
	}

}
