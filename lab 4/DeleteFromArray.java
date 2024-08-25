// 22. Write a program to delete a number from a given location in an array.

import java.util.*;

public class DeleteFromArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter length for array : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		for(int i=0; i<a.length;i++){
			System.out.print("Enter element of array["+(i+1)+"] : ");
			a[i] = sc.nextInt();
		}

		System.out.println();
		System.out.print("Enter delete element : ");
		int element = sc.nextInt();

		int deleteN=0, deleteIndex=0;
		for(int i=0; i<a.length; i++){
			if (a[i]==element) {
				deleteN = a[i];
				deleteIndex = i;
				
			}
		}

		for(int i=deleteIndex; i<a.length-1; i++){
			a[i] = a[i+1];
		}

		System.out.println();
		System.out.print("After delete : ");
		for(int i=0; i<a.length-1;i++){
			System.out.print(a[i] +" ");
		}
	}
}