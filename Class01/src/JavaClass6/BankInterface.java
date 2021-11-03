package JavaClass6;

interface Rbi {
	float deposit();
}

class Sbi implements Rbi {
	public float  deposit() {
		return 9.6f;
	}		
}
class Kotak implements Rbi {
	public float deposit() {
		return 8.6f;	}
}

class BankInterface {

	public static void main(String[] args) {

		Rbi cash = new Kotak();
		Rbi cash1 =new Sbi();
		
		System.out.println(cash.deposit() + " " + cash1.deposit());
	}
}

