package package1;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  String s[][] = new String[3][5];
  
  //First row
      s[0][0]="my";
      s[0][1]="name";
      s[0][2]="is";
      s[0][3]="hameedullah";
      s[0][4]="shaik";
      
      		
   
     //second row 
      s[1][0]="I";
      s[1][1]="work";
      s[1][2]="in";
      s[1][3]="TCS";
      s[1][4]="Hyd";
      
    //third row 
      s[2][0]="as";
      s[2][1]="Mobile";
      s[2][2]="app";
      s[2][3]="Automation";
      s[2][4]="Engineer";
      
      int rowNum;
      int colNum;
      
      for(rowNum=0; rowNum<=2; rowNum++) {
    	  
    	  System.out.println("(Row number is : " + rowNum + ")");
    	  
    	  for(colNum=0; colNum<=4; colNum++) {
    		  
    		  System.out.println(s[rowNum][colNum]+ " ");
    		  
    	  }
  
	}

	}}
