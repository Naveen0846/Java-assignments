package JavaClass5;

//abstract class
abstract class Abstract {
	
	public String fname = "John";
	public int age = 24;
	public abstract void study(); // abstract method 
}

//Subclass (inherit from Main)
//properties of the abstract has been inherited in this class
class Student extends Abstract {
	
	public int graduationYear = 2018;
	public void study() { // the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
}