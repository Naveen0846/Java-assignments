package JavaClass4;

public class ParametrizedConstructor {

	int appleYear;
	String appleModel;
	
	public ParametrizedConstructor(int year,String model) {
		appleYear = year;
		appleModel = model;
	}

	public static void main(String[] args) {
		ParametrizedConstructor param = new ParametrizedConstructor(2021, "Macbook Air");
		System.out.println(param.appleModel+ " " +param.appleYear);
		
	}
}

