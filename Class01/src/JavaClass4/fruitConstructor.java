package JavaClass4;

public class fruitConstructor {

	String fruitName;
	int fruitPrice;
	
	
	//parameterized constructor
	public fruitConstructor(String name, int price) {
		fruitName = name;
		fruitPrice = price;
	}
	
	public static void main(String[] args) {
		
		fruitConstructor con = new fruitConstructor("Apple",100);
		
		System.out.println(con.fruitName + " " + con.fruitPrice);
	}
	}
