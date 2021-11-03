package JavaClass6Collections;

import java.util.LinkedHashSet;

public class LinkedHasSetFuncn {


	public static void main(String[] args) {


		LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();

		//add elements
		ls.add(10);
		ls.add(25);
		ls.add(356);
		ls.add(36);
		ls.add(5);

		//print value 
		System.out.println("Element sin hashset are : " +ls);

		// remove element
		ls.remove(356);
		System.out.println(ls);
		
		//transverse
		for(Integer in : ls) {
			System.out.println("Loop of hashset is : "+in);		
		}
		
	// size
		System.out.println("size of elements is " +ls.size());
	}
}
