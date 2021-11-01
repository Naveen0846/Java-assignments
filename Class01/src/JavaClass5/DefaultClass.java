package JavaClass5;

//default access modifier
class DefaultClass {
	
	
	private String name = "Hello";
	private String lname = "world";
	int age = 10;

	
	
	public static void main(String[] args) {
		
		DefaultClass def = new DefaultClass();
		
		System.out.println(def.name + " " + def.lname + " " + def.age);
	}
}
