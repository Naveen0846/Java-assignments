package JavaClass5;

//final keyword
public class Modifiers {

	final int x = 10;
	final String num = "Hello";
	
	public static void main(String[] args) {
		Modifiers mon = new Modifiers();
		
	//mon.num ="cars";//error cannot assign value no override is allowed
	//mon.x = 19;
	System.out.println(mon.num + " " + mon.x);
	}
}
