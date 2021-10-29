package JavaClass1;
//divison of two number

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		Scanner abc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int a = abc.nextInt();
		
		System.out.println("enter first number");
		int b = abc.nextInt();
		
		int c = a/b;
		
		System.out.println("the divisiopn of two number is :" + c);
		
	}
	
}
