package JavaClass4;

public class ClassMethod {
	
	/*static void name() {
		System.out.println("hello  java");
	}
	public static void main(String[] args) {
		
	name();
	}
}
*/
	
	
static void name() {
	System.out.println("static method");
}

public void omn() {
	System.out.println("public method");
}

public static void main(String[] args) {
	
	//call static method 
	name();
	
	//create object to call public method using class
	ClassMethod abc = new ClassMethod();
	
	abc.omn();
}
}


