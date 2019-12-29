package package1;

public class Loop {

	public static void main(String[] args) {
		int i; int j; int k;
		/*for(i=1;i<5;i++) {
			int a=20; int b=30;
			int c=a+b;
			System.out.println(c +"-" + i++);
		}

		*/
		/*for(i=1;i<10;i++) {
			int a=20; int b=30;
			int c=a*b;
			System.out.println("c value is " + c + "-" + i++);
			
			*/
		for (i=1;i<5;i++) {
			for (j=1;j<5;j++) {
				for(k=1;k<5;k++) {
					System.out.println(i+"-" +j +"-" + k);
				}
			}
		
		}
	}

}

