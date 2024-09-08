// Write a program to implement Counting Sort using Array.

import java.util.*;

public class CountingSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//scan length for array
		System.out.println();
		System.out.print("Enter length for array : ");
		int length = sc.nextInt();

		int[] arr = new int[length];

		//scan element for array
		for(int i=0; i<length; i++){
			System.out.print("Enter element at ("+(i)+") : ");
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.print("Before Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		// find max from array 
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
        	if (arr[i] > max){
                max = arr[i];
        	}
        }

		countingSort(arr,max);
	} 

	//method to sort array
	public static void countingSort(int[] arr,int max){

		int[] c = new int[max+1];
		int[] b = new int[arr.length];

		for(int i=0; i<arr.length; i++){
			c[arr[i]]++; 
		}

		for(int i=1; i<c.length; i++){
			c[i] = c[i] + c[i-1];
		}

		for(int i=arr.length-1; i>=0; i--){
			b[c[arr[i]]-1] = arr[i];
			c[arr[i]]--;
		}

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Counting Sort : ");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}