package JavaClass5;

import java.util.Scanner;

public class FactMethod {

	//findfactorial is method
		private static int findFacttorial(int num) {
			int fact = 1;	
			for(int i=1;i<=num;i++)
			{
				fact = fact*i;
			}
			return fact;
		}
		
		//main method
		public static void main(String[] args) {
		System.out.println("enter the factorial ");
		
		///object creation
		Scanner scan = new Scanner(System.in);
		
		//scanning for input 
		int num = scan.nextInt();
		
		//print outputr using method
         System.out.println("the factorial is :" +findFacttorial(num));
	}	

}
