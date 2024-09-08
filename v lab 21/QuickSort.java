// 97. Write a program to implement Quick Sort using Array.

import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//scan length for array
		System.out.println();
		System.out.print("Enter length for array : ");
		int length = sc.nextInt();

		int[] arr = new int[length];

		//scan element for array
		for(int i=0; i<arr.length; i++){
			System.out.print("Enter element at ("+(i)+") : ");
			arr[i] = sc.nextInt();
		}

		//print unsorted array
		System.out.println();
		System.out.print("Before Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		// Call heap quick method
		quickSort(arr,0,arr.length-1);

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Quick Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr,int low,int high){

		if(low<high){
			int i = low;
			int j = high;
			int pivot = arr[low];

			

			while(i<j){
				 // Move i right, skipping over elements less than the pivot
				while(i < high && arr[i]<=pivot){
					i++;
				}
				 // Move j left, skipping over elements greater than the pivot
				while(j > low && arr[j]>pivot){
					j--;
				}

				// If i is still less than j, swap their elements
				if(i<j){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

			// set pivot element to the correct position
			arr[low] = arr[j];
			arr[j] = pivot;

			quickSort(arr,low,j-1);
			quickSort(arr,j+1,high);
		}
	}
}