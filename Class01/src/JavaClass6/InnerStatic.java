package JavaClass6;

 class InnerStatic {
	 int x = 10;
	 
	 static class InIn{
		 int y =20;
	 }
	 public static void main(String[] args) {
		
		 //one object to call both attributes
		 
		 InnerStatic.InIn inout = new InnerStatic.InIn();
		 System.out.println(inout.y);
	}

}
