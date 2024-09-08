// 98. Write a program to implement Heap Sort using Array.

import java.util.*;

public class HeapSort {
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
		for(int i : arr){
			System.out.print(i + " ");
		}

		// Call heap sort method
		heapSort(arr);

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Heap Sort : ");
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void heapSort(int[] arr){
		
		buildMaxHeap(arr);

		for(int i=arr.length-1; i>=0; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr,i,0);
		}
	}

	public static void buildMaxHeap(int[] arr){
		int n = arr.length;
		for(int i=n/2-1; i>=0; i--){
			heapify(arr,n,i);
		}
	}

	// To heapify a subtree rooted at index i, n is the size of the heap
	public static void heapify(int[] arr,int n,int i){
		int largest = i ;  		// largest as root
		int left = 2*i + 1;		// left child
		int right = 2*i + 2;	// right child

		// If left child is larger than root
		if(left<n && arr[left]>arr[largest]){
			largest = left;
		}

		// If right child is larger than root
		if(right<n && arr[right]>arr[largest]){
			largest = right;
		}

		  // If largest is not root
		if(largest!=i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			// Recursively heapify the affected subtree
			heapify(arr,n,largest);
		}
	}
}