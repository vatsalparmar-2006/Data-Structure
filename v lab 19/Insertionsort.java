// 93. Write a program to implement Insertion Sort using Array.

import java.util.*;

public class Insertionsort {
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

		insertionSort(arr);
	}

	//method to sort array
	public static void insertionSort(int[] arr){

		for(int i=0; i<arr.length; i++){
			int key = arr[i];
			int j=i-1;
			for(; j>=0 && arr[j]>key; j--){
				arr[j+1] = arr[j];
			}
			arr[j+1] = key;
		}

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Insertion Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}