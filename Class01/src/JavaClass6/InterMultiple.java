package JavaClass6;
//in this u have two interface class implementing to class 
interface  Inter1 {
	public void  save();
}

interface Inter2{
	public void get();
}

class Main implements Inter1,Inter2{
	
	public void save() {
		System.out.println("save details");
	}
	
	public void get() {
		System.out.println("get details");
	}
}
public class InterMultiple{
	public static void main(String[] args) {
		
		Main ma =new Main();
		ma.save();
		ma.get();
	}
}