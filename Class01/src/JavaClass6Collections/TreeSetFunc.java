package JavaClass6Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetFunc {

	public static void main(String[] args) {
		TreeSet<String> tr = new TreeSet<String>();
		tr.add("parrot");
		tr.add("peigeon");
		tr.add("peacock");
		tr.add("crow");
		
		 System.out.println("Ascending...");
		 
		    Iterator itr=tr.iterator();
		    while(itr.hasNext()){
		      System.out.println(itr.next());
		    }
		    
		    System.out.println("Descending...");
		    Iterator itr2=tr.descendingIterator();
		    while(itr2.hasNext()){
		      System.out.println(itr2.next());
		    }	  
	}
}

