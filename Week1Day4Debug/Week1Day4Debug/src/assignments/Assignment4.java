package assignments;

public class Assignment4 {

	int age;
	String animal;
	
	private Assignment4() {
		this("Eagle");
	}

	private Assignment4(String a) {
		this(5);
		this.animal = a;
	}
	
	private Assignment4(int b) {
		this.age = 5;
	}
	
	private Assignment4(String a, int b) {
		this(a);
		this.age = b;
	}
	
	public static void main(String[] args) {
	
		// This code should create a new Assignment4 object, and then print the message
		// "Eagle 7"
		// invoke the right constructor to make that happen.
		
		Assignment4 a = new Assignment4("Eagle", 7);
		
		System.out.println(a.animal + " " + a.age);
	}
}
