
//Switch statements :Use the switch statement to select one of many code blocks to be executed.



//syntax
/*switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}*/


//switch, case ,break ,default 
package JavaClass2;

public class SwitchStatements {

	
	public static void main(String[] args) {
		
		int day = 2;
		switch(day)
		{
		case 1:
		System.out.println("yamaha");
		break;
		case 2:
			System.out.println("honda");
			break;
		case 3:
			System.out.println("suziki");
		case 4:
			System.out.println("mojo");
		default:
			System.out.println("r15");
		}
		
	}
}
