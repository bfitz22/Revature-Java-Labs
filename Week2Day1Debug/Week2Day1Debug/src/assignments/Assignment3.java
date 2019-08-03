package assignments;

public class Assignment3 {

	public static void main(String[] args) {
		// This class is attempting to use the properties of Strings in various
		// capacities. Make the required corrections so they work.
		
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "World";
		String str4 = new String("world");
		
		System.out.println("The 4th letter of \"" + str1 + "\" is: " + str1.charAt(4));
		System.out.println("Do \"" + str1 + "\" and \"" + str2 + "\" have the same sequence of characters? " + (str1.equals(str2)));
		System.out.println(str4 + " is " + str4.length() + " characters long");
	}
	
	
}
