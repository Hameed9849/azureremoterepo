package package1;

public class NonStaticVar {

	//Non static variable
	public int a = 4; public int b =8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//class object = new constructor();
		NonStaticVar N = new NonStaticVar();
	System.out.println(N.a*N.b);
	}

}
