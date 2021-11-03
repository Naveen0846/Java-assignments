package JavaClass6;

 class InnerClass {
	
	int x = 10;
	
	class Outer {
		int y = 15;
	}
	
	public static void main(String[] args) {
		
		//object for class 1
		InnerClass in = new InnerClass();
		
		//object creation for class 2 
		
		InnerClass.Outer out = in.new Outer();
		
		System.out.println(in.x + out.y);
	}
}
 
 
