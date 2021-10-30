package JavaClass3;

public class MultArrayLoop {

	public static void main(String[] args) {

		int[][] abc = {{1,2,3,4}, {6,8,9,8,}};

		for(int i= 0; i< abc.length;i++) {

			for(int j=0;j < abc[i].length; i++) {
				System.out.println(abc[i][j]);
			}
		}
	}
}
