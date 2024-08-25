// 31. Read two matrices, first 3x2 and second 2x3, perform multiplication operation
// and store result in third matrix and print it.

import java.util.*;

public class MatrixMultiPlication {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("Alert : columns of first matrix must be eqal rows of second matrix.");

		System.out.println();
		System.out.print("Enter number of rows for first matrix : ");
		int r1 = sc.nextInt();

		System.out.println();
		System.out.print("Enter number of columns for first  matrix : ");
		int c1 = sc.nextInt();

		int[][] a = new int[r1][c1];

		System.out.println();
		System.out.println("Enter element for first matrix,");
		for(int i=0; i<r1; i++){
			for(int j=0; j<c1; j++){
				System.out.print("Enter element of matrix["+(i+1)+"]["+(j+1)+"] : ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println();
		System.out.print("Enter number of rows for second matrix : ");
		int r2 = sc.nextInt();

		System.out.println();
		System.out.print("Enter number of columns for second  matrix : ");
		int c2 = sc.nextInt();

		if(c1!=r2){
			System.out.println();
			System.out.println("columns of first matrix must be eqal rows of second matrix.");

			return;
		}

		int[][] b = new int[r2][c2];

		System.out.println();
		System.out.println("Enter element for second matrix,");
		for(int i=0; i<r2; i++){
			for(int j=0; j<c2; j++){
				System.out.print("Enter element of second matrix["+(i+1)+"]["+(j+1)+"] : ");
				b[i][j] = sc.nextInt();
			}
		}

		int[][] ans = new  int[r1][c2];

		for(int i=0; i<r1; i++){
			for(int j=0; j<c2; j++){
				for(int k=0; k<c1; k++){
					ans[i][j] += a[i][k]*b[k][j]; 
				}
			}
		}

		System.out.println();
		System.out.println("Multiplication is : ");
		for(int i=0; i<r1; i++){
			for(int j=0; j<c2; j++){
				System.out.print(ans[i][j] +" ");
			}
			System.out.println();
		}
	}
}