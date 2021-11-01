package JavaClass4;

public class BikeConstructor {
	
	String bikeName;
	String bikeBrand;
	int bikeMileage;
	
	
	public BikeConstructor(String name, String brand ,int mileage) {
		bikeName = name;
		bikeBrand = brand;
		bikeMileage = mileage;
	}
	
	public static void main(String[] args) {
		BikeConstructor con = new BikeConstructor("Dio", "honda", 45);
		
		System.out.println(con.bikeName);
		System.out.println(con.bikeBrand);
		System.out.println(con.bikeName);
		
	}

}
