
public class JumpRope {
	double length;
	
	public JumpRope(double value) {
		System.out.println(value);
		length = value; 
	}
	
	public JumpRope() {
		System.out.println("No arg constructor ran.");
		length = 7.0;
	}
	
	public static void main(String[] args) {
		JumpRope jumpRope = new JumpRope(6.5);
		JumpRope jumpRopeNoArg = new JumpRope();
	}
}
