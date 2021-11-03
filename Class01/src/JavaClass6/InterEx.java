package JavaClass6;

//one single interface implementing individually in other two class
interface Area {
void draw();
}

class Circle implements Area{
	public void draw() {
		System.out.println("its a circle");
	}
}

class Square implements Area{
	public void draw() {
		System.out.println("its a square ");
	}
}

public class InterEx{
	
	public static void main(String[] args) {
		//object for square class
		Area in = new Square();
		
		//object for circle 
		Area circ = new Circle();
		
		//prints square
		in.draw();
		//print circle
		circ.draw();
	
	}
}