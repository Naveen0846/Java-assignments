package JavaClass3;

/* * public class MethodParameters {
 * 
 /
 * static void mani(String fname) {
 * 
 * System.out.println(fname ); }
 * 
 * public static void main(String[] args) { for(int i = 0;i < 10; i++) {
 * 
 * mani("basu"); } }
 * 
 * }
 * 
 */


/*
 * public class MethodParameters {
 * 
 * static void name(String name) { System.out.println(name +
 * "+bali = bahubali"); }
 * 
 * public static void main(String[] args) { name("bahu"); name("bahu"); } }
 */


//multiple parameters
public class MethodParameters{
	
	static void name(String geva) {
		System.out.println(geva +"bali");
	}
	
	public static void main(String[] args) {
		
		for(int i =0; i<10; i++) {
			name("bahu");
		}
	}
	
	
	
}