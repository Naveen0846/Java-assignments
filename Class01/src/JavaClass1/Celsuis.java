package JavaClass1;
// celsius to fahrenheit conversion

import java.util.Scanner;

public class Celsuis {
   
	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		//
		System.out.println("Enter Celsius");	
		double celsius = scan.nextDouble();
		
		System.out.println("enter Faraneheit");
		
		double fahrenheit  = scan.nextDouble();
		
	

		fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("value of fahrenheit:"  + fahrenheit);
}
}