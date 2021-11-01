package JavaClass5;


//in this class u need to call the student class so  that all properties in other two classes can be print in the main class
class Abstract2 {
	  public static void main(String[] args) {
	    // create an object of the Student class (which inherits attributes and methods from Main)
	    Student myObj = new Student(); 
	    
	    System.out.println("Name: " + myObj.fname);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	    myObj.study(); // call abstract method
	  }
	}