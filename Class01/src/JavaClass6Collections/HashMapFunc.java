package JavaClass6Collections;

import java.util.HashMap;

//HashMap
public class HashMapFunc {

	
	public static void main(String[] args) {
		
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		
		hs.put("hello", 01);
		hs.put("gold", 02);
		hs.put("silver", 03);
		hs.put("platinum", 04);

		System.out.println(hs);
	
		//access specific elements
		System.out.println("key value of hello is : "+hs.get("hello"));
		
		//hashMap functions 
		//hashmapsize
		System.out.println("total hasmap size is : " +hs.size());
		
		//loop through map fetches keyvalues
		for(String i : hs.keySet()) {
			System.out.println("keu=yvalues are : "+i);
		}
		
		//fetches value associated with key
		for(Integer j : hs.values()) {
			System.out.println("value for key are "+j);		
	}
		
	}
}
