package assignments;

public class Assignment3 {

	public static void main(String[] args) {
	
		// The following code should instantiate two Language objects, and print their names.
		// Debug the Language class so the code in this method works.
		
		Language java = new Language("Java");
		Language cpp = new Language("C++");
		
		System.out.println(java.getName());
		System.out.println(cpp.getName());
	}
}

class Language {
	private String name;
	
	public Language() {
		System.out.println("No-arg constructor invoked.");
	}
	
	public Language(String classChoice) {
		this.name = classChoice;
	}
	
	// Write a constructor that will allow the code in Assignment3.main(String[]) to work.
	
	
	public String getName() {
		return this.name;
	}
}
