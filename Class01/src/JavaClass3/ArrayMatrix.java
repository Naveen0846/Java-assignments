package JavaClass3;

//Multiply two matrices
public class ArrayMatrix {
	
	public static void main(String[] args) {
		
	//creating two matrices
		int a[][] = {{1,1,1,},{2,2,2,},{3,3,3,}};
		int b[][] = {{1,1,1,},{2,2,2,},{3,3,3,}};
		
		// to store multiplied value
		int c[][] = new int[3][3]; //3 rows and 3 columns
		
		
		//multiply 2 matrices
		for(int i= 0;i< 3; i++) {
			
			for(int j=0; j< 3; j++) {
				
				c[i][j] = 0;
				
				for (int k =0;k<3;k++) {
					
					c[i][j]+= a[i][k]*b[k][j];
				}
				//end of loop
				
				System.out.print(c[i][j] + " ");//print matrix elements
				}
			//end of loop
			System.out.println(); //new line
			}
		}
		
		
	}


