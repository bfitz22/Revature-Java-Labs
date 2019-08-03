package assignments;

import modifiable.Dog;
import modifiable.Person;

public class Assignment1 {
	
	// The code in this class should not need to be changed. However, the code of every class
	// in the package "modifiable" will need to be changed. Some corrections will reveal more
	// bugs underneath...
	
	// Hint: Remember the difference between inheritance (IS-A) and composition (HAS-A)
	// Hint 2: There are problems with Animal, Dog, AND Person
	public static void main(String[] args) {
		Person sam = new Person(new Dog());
		
		sam.playWithPet();
	}

}
