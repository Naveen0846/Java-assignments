package JavaClass6Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortString {

	public static void main(String[] args) {


		ArrayList<String> bikes = new ArrayList<String>();

		bikes.add("ktm");
		bikes.add("r15");
		bikes.add("splendor");
		bikes.add("Impulse");

		//collections sort() method
		Collections.sort(bikes);
		
		//for-each methods
		for(String i : bikes) {
			System.out.println(i);
		}
	}
}
