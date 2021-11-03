package JavaClass6;

 class Out {

	int x =10;
	
	class Inner{
		public int method() {
			return x;
		}
		}
	}
 
	public class Outers {
	public static void main(String[] args) {
		//object for out
		Out in = new Out();
	Out.Inner out = in.new Inner();
	System.out.println(out.method());
	}
}
