package JavaClass6Collections;

import java.util.HashSet;

public class HashSetFuncn {
  
	
	public static void main(String[] args) {
		
		HashSet<String>  hs = new HashSet<String>();
	
			hs.add("students");
			hs.add("faculty");
			hs.add("principal");
			hs.add("founder");
			
			//printing added elements in hashset
			System.out.println("1)prints all elements in hashset :"+hs);
			
			//size of hashset
			System.out.println("2)size of hashset is : " +hs.size());
			
			//transverse
			for(String str : hs) {
				System.out.println("3)loop is :" +hs);
			}
			
				//check if elements exists in hashset
				hs.contains("students");
				System.out.println("4)does it exists:" +hs);
				
				
				//remove particular element
				hs.remove("faculty");
				System.out.println("5)element removed was : " +hs);
			}
	}

