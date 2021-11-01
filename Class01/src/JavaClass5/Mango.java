package JavaClass5;

//class fruit
 class Fruit {

	//if u use private u cant this attribute in the second class so use protected 
	protected String apple;
	public void fruit() {
		System.out.println("A apple day keeps doctor away");
	}
	
	
}
	
	 public class Mango extends Fruit {

		private String mango = "Its mango season";
		
		public static void main(String[] args) {
			
			Mango mango = new Mango();
			mango.fruit();
			System.out.println(mango.apple);
			
			}
		}
	

