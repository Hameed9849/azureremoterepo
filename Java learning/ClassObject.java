
public class ClassObject {

	int height;
	int weight;
	
	public void run() {
		System.out.println("He can run");
		
	}
	
	public void walk() {
		
		System.out.println(" He can walk");
		
	}
	
	
	public static void main(String[] args) {
		ClassObject b1= new ClassObject();
		ClassObject b2= new ClassObject();
		
		b1.height=5;
		b1.weight=50;
		b1.run();
		b1.walk();
		
		System.out.println("Boy1 hieght is " + b1.height);

		System.out.println("Boy1 weight is " + b1.weight);
		
		
		b1.height=6;
		b2.weight=60;
		b2.run();
		b2.walk();

		System.out.println("Boy2 hieght is " + b2.height);

		System.out.println("Boy2 hieght is " + b2.height);

	}

}
