package JavaClass6;

class Inner {
	public void sound() {
		System.out.println("bow bow");
	}
}
//
class Outer extends Inner {
	public void sound() {
		System.out.println("meo meo");
	}
}

 class Extra extends Outer {
	public void  sound() {
		System.out.println("duck duck");
	}
}
class Polymorphism{
	public static void main(String[] args) {

		Inner in = new Inner();
		Outer out =new Outer();
		Extra ext = new Extra();
		
		in.sound();
		out.sound();
		ext.sound();

	}
}
