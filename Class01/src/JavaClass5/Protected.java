package JavaClass5;

 class Protected {
	 
		  protected String fname = "John";
		  protected String lname = "dere";
		  protected String email = "name@.com";
		  protected int age = 23;
 }

		  
	 class Abcd extends Protected {
		
		 public static void main(String[] args) {
				  
			 Abcd obj = new Abcd();
		    
		    System.out.println("Name: " + obj.fname + " " + obj.lname);
		    System.out.println("Email: " + obj.email);
		    System.out.println("Age: " + obj.age);
		   
		 }
		  }
		


