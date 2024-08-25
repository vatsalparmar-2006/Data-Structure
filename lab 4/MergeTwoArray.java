// 26. Write a program to merge two unsorted arrays.

import java.util.*;

public class MergeTwoArray {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println("Enter length for first matrix,");
		int n1 = getSize();

		System.out.println();
		System.out.println("Enter length for second matrix,");
		int n2 = getSize();

		int[] a = new int[n1];
		int[] b = new int[n2];
		int[] c = new int[a.length + b.length];

		System.out.println();
		System.out.println("Enter element for first matrix,");
		scanMatrix(n1,a);
		System.out.println();
		System.out.println("Enter element for second matrix,");
		scanMatrix(n2,b);

		mergeMatrix(a,b,c);

		printMatrix(c);
	}

	public static int getSize(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length for matrix : ");
		int n = sc.nextInt();

		return n;
	}

	public static int[] scanMatrix(int n,int[] c){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<n; i++){
			System.out.print("Enter element of matrix["+i+"] : ");
			c[i] = sc.nextInt();
		}

		return c;
	}

	public static void mergeMatrix(int[] a,int[] b,int[] c){
		for(int i=0; i<a.length; i++){
			c[i] = a[i]; 
		}

		for(int i=0; i<b.length; i++){
			c[i + (a.length)] = b[i];
		}
	}

	public static void printMatrix(int[] c){
		System.out.println();
		System.out.println("After Merge : "+Arrays.toString(c));
	}
}