package JavaClass4;

public class Constructor {
	int x ;

/*	//zero constructor
	public Constructor() {
		x = 100;
	}

	public static void main(String[] args) {

		Constructor now = new Constructor();

		System.out.println(now.x);
	}
}*/
	
public Constructor(int y) {
	x = y;
}
 
public static void main(String[] args) {
	Constructor con = new Constructor(5);
	System.out.println(con.x);
}
}