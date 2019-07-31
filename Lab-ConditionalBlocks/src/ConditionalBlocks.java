
public class ConditionalBlocks {
	public static void main(String[] args) {
		boolean isTrue = true; 
		
		if (isTrue) {
			System.out.println("Horray!");
		}
		
		int y = 8;
		
		if (y >= 3) {
			System.out.println("y is greater than or equal to 3.");
		} else {
			System.out.println("y is not greater than or equal to 3.");
		}
		
		boolean BobIsFun = true;
		boolean JenIsFun = false;
		
		if (BobIsFun) {
			System.out.println("Bob is fun");
			if (JenIsFun) {
				System.out.println("Jen and Bob are a fun couple. We'll go to dinner with them");
			} else {
				System.out.println("I don't know if I can handle dinner with Jen");
			}
		} else {
			System.out.println("Bob isn't fun. I don't want to have dinner with him, so there isn't any"
					+ " point in seeing if Jen is fun or not.");
		}
		
		float x = 2;
		
		if (x == 3) {
			System.out.println("x is equal to 3");
		} else if (x > 5) {
			System.out.println("x is greater than 5");
		} else if (x <= 0) {
			System.out.println("x is less than or equal to 0");
		} else {
			System.out.println("x is none of the other options");
		}
	}
}
