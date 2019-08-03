package modifiable;

public abstract class Animal {
	
	public String name;
	
	// This should be abstract
	public abstract void eat();
	
	// This should be concrete
	public void move(int distance) {
		System.out.println("I move " + distance + " meters.");
	}

}
