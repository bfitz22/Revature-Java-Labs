
public class Parrot {
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.talk();
		
		String[] words = {"Howdy", "Polly", "wanna", "cracker"};
		parrot.repeat(words);
		
		int crackersEaten = parrot.crackersEaten(11, 10);
		System.out.println("The parrot ate " + crackersEaten + " crackers");
	}
	
	public void talk() {
		System.out.println("Squawk squawk squawk");
	}
	
	public void repeat(String[] words) {
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);			
		}
	}
	
	public int crackersEaten(int crackersStolen, int crackersGiven) {
		return crackersStolen + crackersGiven;
	}
}
