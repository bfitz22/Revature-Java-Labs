package assignments;

public class Assignment2 {

	public static void main(String[] args) {
		// The following code should create an Animal object, and then modify its properties.
		// Make the required corrections so it is able to do so. Nothing in THIS class should
		// need to be changed.
		Animal critter = new Animal();
		
		critter.name = "Flippy";
		critter.age = 5;
		
		System.out.println(critter.name + " is " + critter.age + " years old!");
	}
}