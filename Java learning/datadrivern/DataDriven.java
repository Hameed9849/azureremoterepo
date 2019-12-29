package datadrivern;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;


public class DataDriven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//importing file input stream to identify location of excel
		FileInputStream  f = new FileInputStream("C:\\Users\\Hameed\\Desktop\\ReadData.xls");
		
		//opening identified workbook
		Workbook wb = Workbook.getWorkbook(f);
		
		//Opening sheet in opened workbook
		Sheet S =wb.getSheet("Sheet1");
		
		//identify the cell in a sheet and read data from cell
		System.out.println(S.getCell(0, 0).getContents());
		System.out.println(S.getCell(0, 1).getContents());

	}

}