package arithmetic_calculator;

public class Arrays {

	public static void main(String[] args) {                       //1D array

		int a[]= {10,20,30,40,50};
		
		for(int i=0;i<5;i++) {
			
		System.out.println("Elements of array a: "+a[i]);
		}


	
		int[][] b = {                                      // two dimensional array
		            {2, 4, 6, 8}, 
		            {3, 6, 9 ,10},
		            {4, 5, 7, 5}
		            };
		System.out.println("\nLength of row 1: " + b[0].length);

		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("Elements of array b: "+b[i][j]);
				
			}
			
		}
	}
}
