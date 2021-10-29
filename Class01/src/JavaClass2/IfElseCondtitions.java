
//If and If else
/*Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed*/

/*if (condition) {
  // block of code to be executed if the condition is true
}*/

package JavaClass2;

import java.util.Scanner;

public class IfElseCondtitions {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		
		int name = scan.nextInt();
	
		
		if(10 > name) {
			System.out.println("good day");
		}else {
			System.out.println("bad day");
		}
	}

}
