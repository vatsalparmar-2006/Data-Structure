// 99. Write a program to implement Shell Sort using Array.

import java.util.*;

public class ShellSort {
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

		// Call Shell sort method
		shellSort(arr);

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Shell Sort : ");
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void shellSort(int[] arr){
		int n = arr.length;

		// Divided initial segment gap n=n/2
		for(int gap=n/2; gap>=1; gap=gap/2){
			// Perform insertion sort for elements that are 'gap' distance apart
			for(int i=gap; i<n; i++){

				for(int j=i-gap; j>=0; j=j-gap){
					if(arr[j+gap]>arr[j]){
						break;
					}
					else{  //Place temp (the original arr[i]) at its correct location
						int temp = arr[j+gap];
						arr[j+gap] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}
}