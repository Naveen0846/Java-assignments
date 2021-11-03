package JavaClass6;

abstract class Abs {
	//abstract method
	public abstract void method1();
	//regular method
	public void sleep() {
		System.out.println("regular method ");
	}
}
class Hero extends Abs{
	//passing values for above method declared in class 1
	public void method1() {
		System.out.println("your name is ");
	}
}

class AbstractClass1 {
	public static void main(String[] args) {

		Hero owl = new Hero();

		owl.method1();
		owl.sleep();
	}


}


