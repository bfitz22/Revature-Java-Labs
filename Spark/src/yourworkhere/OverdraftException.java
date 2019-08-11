package yourworkhere;

public class OverdraftException extends RuntimeException {
	@Override
	public String getMessage() {
		return "You will be charged an overdraft fee";
	}
}
