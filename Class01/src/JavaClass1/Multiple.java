package JavaClass1;
// Multiple of two numbers

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("enter first num");
		int a = scan.nextInt();
		
		System.out.println("enter second num");
		int b = scan.nextInt();
		
		
		
		int c =a * b ;
		
		System.out.println("Multiple of two num is:" +c);
		
		
	}

}
