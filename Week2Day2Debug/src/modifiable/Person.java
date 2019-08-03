package modifiable;

public class Person {
	
	Dog pet;
	
	public Person(Dog pet) {
		this.pet = pet;
	}
	
	public void playWithPet() {
		System.out.println("Playing with my dog, " + pet.name + "!");
		pet.play();
	}

}
