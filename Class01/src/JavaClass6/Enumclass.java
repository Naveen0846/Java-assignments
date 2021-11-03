package JavaClass6;

public class Enumclass {

	enum Level{
		abc, bde,afg
		}
	
	public static void main(String[] args) {
		
		//Level lev = Level.abc;
	
		
		//loop through enum
		for(Level num : Level.values()) {
		System.out.println(num);
	}
}
}