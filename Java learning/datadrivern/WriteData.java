package datadrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream f = new FileOutputStream ("C:\\Users\\Hameed\\Desktop\\Data1.xls");
		WritableWorkbook  wwb = jxl.Workbook.createWorkbook(f);
		WritableSheet ws = wwb.createSheet("Result", 0);
		
		int a = 20; int b=30;
		int c=a+b;
		Label l=new Label(0,0, "C value is  " + c);
		
			
		ws.addCell(l);
		
		wwb.write();
		wwb.close();
		
		
		
		

	}

}
