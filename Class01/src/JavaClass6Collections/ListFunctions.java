package JavaClass6Collections;

import java.util.ArrayList;

public class ListFunctions {


	public static void main(String[] args) {


		ArrayList<String> birds = new ArrayList<String>();

		//adding elements to an array
		birds.add("parrot");
		birds.add("peigeon");
		birds.add("peacock");
		birds.add("crow");
		System.out.println("1) Print all elements in array : "  +birds);

		//get particular elements	
		System.out.println("2) Get a particular element : "  +birds.get(2));

		//change /replace elements
		birds.set(2, "kukobura");
		System.out.println("3) replaced element is: " +birds);

		//arraylist size
		System.out.println("4) arrraylist size is : " +birds.size());

				//or out put for both for loop and for each is same only 
		
		//Loop through array list
		for(int i = 0; i< birds.size();i++) {
			System.out.println("5) loop of an arry is: " +birds.get(i));
		}


		//for-each loop
		//for(String n : birds) {
		//	System.out.println("6)for-each loop :" +n);
		//}


		//remove elements
		//birds.remove(2);
		//System.out.println("7) removing a particular element:" +birds);

		//list will update when deleted 
		//System.out.println("5) delete particular element: " + birds.get(2));

		//to remove all elements in arraylist
		//birds.clear();
		//System.out.println("9) Delete entire array:" +birds);
	}
}

