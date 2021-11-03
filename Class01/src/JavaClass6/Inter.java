package JavaClass6;

 interface Ram {
 void run();
}

 class Counter implements Ram{
	 
	 public void run() {
		 System.out.println("Hello implementing here");
	 }
	 
	 public void eat() {
		 System.out.println("Hello second method");
	 }
 }
 
 class Inter{
	 public static void main(String[] args) {
		
		 Counter count = new Counter();
		 
		 count.run();
		 count.eat();
	}
 }