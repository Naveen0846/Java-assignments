package JavaClass3;

public class MethodOverloading {

	static int abc(int x, int y) {
		return x + y;
	}

	static float abc1(float x, float y) {
		return x * y;
	}



	public static void main(String[] args) {
		
		int z = abc(5, 10);
		float y = abc(2, 10);
	
		
		System.out.println("int " +z);
		System.out.println("float "+y);
	}
}
