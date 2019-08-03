package assignments;

import modifiable.PlainOldJavaObject;

public class Assignment1 {

	public static void main(String[] args) {
		
		// All of the lines of code below *should* work. However, there are several
		// issues with the PlainOldJavaObject class, which are preventing them from
		// working properly. Make any required changes to the PlainOldJavaObject class
		// required to run the below code successfully without changing it.
		
		// Hint: Remember what a getter and setter are supposed to do.
		// Hint 2: Remember what the parameter list of a method actually does...
		PlainOldJavaObject pojo = new PlainOldJavaObject();
		
		System.out.println("Setting var1...");
		pojo.setVar1(10);
		System.out.println("Value of var1 is: " + pojo.getVar1());
		
		System.out.println("Setting var2...");
		pojo.setVar2(5);
		System.out.println("Value of var1 is: " + pojo.getVar2());
		
	}
	
	
}
