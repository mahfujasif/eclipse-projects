package pkg.one;

public class Test {
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void getMessage() {
		System.out.println("Message: "+message);
	}
	
	public void getMessage2() {
		System.out.println("also Message: "+message);
	}
}
