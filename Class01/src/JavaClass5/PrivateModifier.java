package JavaClass5;

//setting private to attributes and cannot access outside of class
public class PrivateModifier {

	private String name = "Hello";
	private String lname = "world";
	int age = 10;
	
	
	public static void main(String[] args) {
		
	PrivateModifier now =new PrivateModifier();
	
	System.out.println(now.name + " " + now.lname + " " + now.age);
	}
}
