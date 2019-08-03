package assignments;

public class Assignment2 {

	private static int numInstances = 0;
	
	private Assignment2() {
		numInstances++;
	}
	
	public static void main(String[] args) {
		
		// This assignment is making use of methods and variables that should be
		// global, or belong to the class rather than an instance.
		
		doSomething();
		
		Assignment2 obj1 = new Assignment2();
		Assignment2 obj2 = new Assignment2();
		
		System.out.println(Assignment2.numInstances);
	}
	
	public static void doSomething() {
		System.out.println("doSomething() invoked!");
	}
	
}
