package JavaClass6Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorfunc {
	public static void main(String[] args) {
		

		ArrayList<String> birds = new ArrayList<String>();

		//adding elements to an array
		birds.add("parrot");
		birds.add("peigeon");
		birds.add("peacock");
		birds.add("crow");
		System.out.println("1) Print all elements in list : "  +birds);
		
		
		///get the iterator
		Iterator<String> it = birds.iterator();
		//System.out.println(it.next());
		
		//loop through collection
		while(it.hasNext()) {
		System.err.println("loop of list is: "+it.next());
		
		//remove
		//it.remove();
		//System.out.println(it);
	}
	}
}
