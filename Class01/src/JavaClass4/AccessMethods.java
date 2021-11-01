package JavaClass4;

public class AccessMethods {

	public void acer() {
		System.out.println("processor i7");
	}
	
	public void price(int rupees) {
		System.out.println("diwali price 40% off :" +rupees);
	}
	
	public static void main(String[] args) {
		AccessMethods mom = new AccessMethods();
		
		mom.acer();
		mom.price(55000);
	}
}
