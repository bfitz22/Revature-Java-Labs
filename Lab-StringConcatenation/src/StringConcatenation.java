
public class StringConcatenation {
	public static void main(String[] args) {
		String beginning = "Hello";
		
		String end = " World";
		String combo = beginning + end;
		
		System.out.println(combo);
		
		long l = 203L;
		
		System.out.println("The value of l: " + l);
		
		short s = 2; 
		
		System.out.println("The value of my short is " + s);
		
		boolean sodaIsHealthy = false;
		
		System.out.println(sodaIsHealthy + ", soda is not healthy");
		
		int cookies = 9;
		int cake = 4;
		
		System.out.println(cookies + cake + " cookie-cakes is the perfect number of cookie cakes.");
		System.out.println("Or is it " + cookies + cake);
		System.out.println("Nope, it's definitely " + (cookies + cake));
	}
}

