package JavaClass3;

public class Return {

/*	static int method(int x) { //single param
		return 5 + x;
	}
	
	public static void main(String[] args) {
		System.err.println(method(3));
	}
}
*/
/*	//multiple value
	static int value(int x, int y) {
		return x +y;
	}
	
	public static void main(String[] args) {
		System.out.println(value(5,6));
	}
	}*/
	
	//store result in variable
	
	static int name(int x, int y) {
		return x * y;
	}
	
	public static void main(String[] args) {
		
		int z = name(5,8);
		System.out.println(z);
	}		
	}