package JavaClass1;
//factorial of number 

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
	
		int num = 4;
		int fact = 1;
		
		 for(int i=1; i<=num; i++)
		 {
			fact = fact * i;
		 }
		 System.out.println("factorials is : " + fact);
		
	}

}
