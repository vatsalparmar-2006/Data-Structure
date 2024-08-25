// 94. Write a program to implement Selection Sort using Array.

import java.util.*;

public class Selection_Sort {
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

		selectionSort(arr);
	}

	//method to sort array
	public static void selectionSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			int min = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[min]){
					min = j;
				}
			}
			if(min!=i){
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Selection Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}