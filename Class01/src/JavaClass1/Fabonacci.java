package JavaClass1;
// fabonacci series 


import java.util.Scanner;

public class Fabonacci {
	
	//0 1 1 2 3 5 8
	// num 1 =0
	//num 2 = 1
	//nextnum = 1
	//nextnum =num1+num2;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int num1 =0;
		int num2 =1;
		int nextnum;
		
		System.out.println("enter the length of series");
		int length = scan.nextInt();
		
		scan.close();
		//
		for(int i=0; i<=length;i++ ) {
			
			nextnum =num1 +num2;
			num1 =num2;
			num2 = nextnum;
			
			System.out.print(+num1 );
			
		}

		
	}
}
