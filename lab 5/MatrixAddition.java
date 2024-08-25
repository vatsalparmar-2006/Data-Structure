// 30. Read two 2x2 matrices and perform addition of matrices into third matrix and
// print it.

import java.util.*;

public class MatrixAddition {
	public static void main(String[] args) {
		
		System.out.println();
		int r = getRow();
		int c = getColumn();

		int[][] a = new int[r][c];
		int[][] b = new int[r][c];
		int[][] ans = new int[r][c];

		System.out.println();
		System.out.print("Enter elements for first matrix :");
		scanMatrix(r,c,a);
		System.out.print("");
		System.out.println("Enter elements for second matrix :");
		scanMatrix(r,c,b);

		sumOfMatrix(a,b,ans);

		printMatrix(r,c,ans);
	}

	public static int getRow(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r = sc.nextInt();

		return r;
	}
	public static int getColumn(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of columns : ");
		int c = sc.nextInt();

		return c;
	}

	public static int[][] scanMatrix(int r,int c,int[][] ans){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print("Enter element of matrix["+(i+1)+"]["+(j+1)+"] : ");
				ans[i][j] = sc.nextInt();
			}
		}

		return ans;
	}

	public static void sumOfMatrix(int[][] a,int[][] b,int[][] sum){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
	}

	public static void printMatrix(int r,int c,int[][] ans){
		System.out.println("Sum of matrix is :");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(ans[i][j] +" ");
			}
			System.out.println();
		}
	}
}