package JavaClass4;

//class 
public class ClassandObject {
	int x =5;
	int y = 10;
	
	//main
	public static void main(String[] args) {
		
		//object 1
		ClassandObject create = new ClassandObject();
		
		//object 2
		ClassandObject create1 = new ClassandObject();

		
		//print object x value in obj 1
		System.out.println(create.x);
		
		//print object 2 y value in object 2
		System.out.println(create1.y);
	}
}