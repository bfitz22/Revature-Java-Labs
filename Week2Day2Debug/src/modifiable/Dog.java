package modifiable;

public class Dog extends Animal {

	String mood;
	
	public Dog() {
		this.mood = "uninterested";
		this.name = "George";
	}
	
	public void eat() {
		System.out.println("om nom nom");
	}
	
	public void play() {
		mood = "happy";
		System.out.println("Woof!");
	}
}
