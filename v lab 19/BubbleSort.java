// 92. Write a program to implement Bubble using Array.

import java.util.*;

public class BubbleSort {
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

		bubbleSort(arr);
	}

	//method to sort array
	public static void bubbleSort(int[] arr){

		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				else{
					continue;
				}
			}
		}

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Bubble Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	} 
}