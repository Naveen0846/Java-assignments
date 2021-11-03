package JavaClass6;
	
	enum Actions {
		high,low,medium
	}

	
	public class EnumSwitch {
		
		public static void main(String[] args) {
			
			Actions act = Actions.low;
			
			
			switch(act) {
			
			case high:
				System.out.println("correct");
				break;
			case low:
				System.out.println("yes");
				break;
			case medium:
				System.out.println("no");
			}
		}
	
	
}
