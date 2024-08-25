// 25. Write a program to delete duplicate numbers from an array.

import java.util.*;

public class DeleteDuplicate {
	public static void main(String[] args) {
		
		// delete from  array

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter length for array : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		for(int i=0; i<a.length;i++){
			System.out.print("Enter element of array["+(i+1)+"] : ");
			a[i] = sc.nextInt();
		}

		int count=0;
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(a[i]==a[j]){
					count++;
				}
			}
		}

		int[] newa = new int[a.length-count-1];
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length-count-1; j++){
				if(a[i]!=a[i++]){
					newa[j] = a[i];
				}
			}
		}

		System.out.println();
		System.out.print("After Sort : ");
		for(int temp : newa){
			System.out.print(temp+" ");
		}
	}
}