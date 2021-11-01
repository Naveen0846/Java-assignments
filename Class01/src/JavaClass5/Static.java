package JavaClass5;

public class Static {

	static void name() {
		System.out.println("hello java");
	}
	
	public void method() {
		System.out.println("java 8");
	}
	
	public static void main(String[] args) {
		
		//to call public method u need a object 
		Static sat =new Static();
		
		sat.name();
		
		sat.method();
	}
}
