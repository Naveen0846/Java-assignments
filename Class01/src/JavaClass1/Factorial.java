package JavaClass1;
//factorial of number 

import java.util.Scanner;

//n! = n*n-1;
//5! = 5*4*3*2*1 =120

public class Factorial {

	public static void main(String[] args) {

		System.out.println("enter the factorial ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
		//logic
		int fact = 1;	
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.println("the factorial is :" +fact);
	}
}