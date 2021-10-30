package JavaClass3;

import java.util.Scanner;

public class methodScope {

	/*	public static void main(String[] args) {

		int x =10;

		System.out.println(x);
	}
}
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter first num");
		int x = scan.nextInt();

		System.out.println("enetr the 2nd num");
		int y =scan.nextInt();



		int z =x + y;

		System.out.println("answer is : " +z);
	}
}