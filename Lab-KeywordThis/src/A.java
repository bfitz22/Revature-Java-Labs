
public class A {
	private long id;
	
	public A() {
		this(2L); 
	}
	
	public A(long id) {
		initialize();
		this.id = id;
	}
	
	public long getId() { return this.id; }
	
	public void setId(long id) { this.id = id; }
	
	private void initialize() {
		System.out.println("initializing the class...");
	}
}
