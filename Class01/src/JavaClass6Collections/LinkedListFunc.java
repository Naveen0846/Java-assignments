package JavaClass6Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListFunc {

	public static void main(String[] args) {

		LinkedList<String> birds = new LinkedList<String>();

		//adding elements to an array
		birds.add("parrot");
		birds.add("peigeon");
		birds.add("peacock");
		birds.add("crow");

		//print added item
		System.out.println("1)The added list is : " +birds);


		//add item at first of list
		birds.addFirst("abc");
		System.out.println("2)the item added at beggining is :" +birds);


		//add item at last of list
		birds.addLast("its end");
		System.out.println("3)the end of list is :" +birds);

		//get first element 
		birds.getFirst();
		System.out.println("4)first element is:" +birds);

		//get last element
		birds.getLast();
		System.out.println("5)last element is :" +birds);

		//remove first element of list
		birds.removeFirst();
		System.out.println("6)removed first element " +birds);

		//remove last element
		birds.removeLast();
		System.out.println("7)last element removed" +birds);

		//sort
		Collections.sort(birds);

		//for-each 
		for(String str : birds) {
			System.out.println("8)transverse all elements : " +str);
		}


	}

}
