package JavaClass6Collections;

import java.util.ArrayList;
import java.util.Collections;

public class IntSort {
	
	public static void main(String[] args) {
		
		
	ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(25);
		num.add(65);
		num.add(98);
		num.add(25);
		
		//collection sort method
		Collections.sort(num);
		
		//for-each method
		for(Integer i : num) {
		System.out.println(i);
		}
	}

}
