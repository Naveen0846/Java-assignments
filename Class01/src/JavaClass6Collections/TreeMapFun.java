package JavaClass6Collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapFun {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("abc", 77);
		tm.put("fdd", 44);
		tm.put("cvx", 1);
		tm.put("gvfh", 6);
		System.out.println("All values in map are : "+tm);
		
		System.out.println("value of the abc is : "+tm.get("abc"));
		
		Set<Map.Entry<String, Integer>> st = tm.entrySet();
		for(Map.Entry<String, Integer> me : st) {
			System.out.println(me.getKey() + ":");
			System.out.println(me.getValue());
		}
		

	}
}
