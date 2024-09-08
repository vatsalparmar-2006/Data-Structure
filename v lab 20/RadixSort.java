// 95. Write a program to implement Radix Sort using Array.

import java.util.*;

public class RadixSort {
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

		radixSort(arr);
	}

	//method to sort array
	public static void radixSort(int[] arr){

		// find max from array 
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
        	if (arr[i] > max){
                max = arr[i];
        	}
        }

		for(int place=1; max/place>0; place *= 10){
			countingSort(arr,place);
		}
			
		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Radix Sort : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// method for counting sort
	public static void countingSort(int[] arr,int place){

		int[] b = new int[arr.length];
		int[] c = new int[10];

		for(int i=0; i<arr.length; i++){
			c[(arr[i]/place)%10]++; 
		}

		for(int i=1; i<c.length; i++){
			c[i] = c[i] + c[i-1];
		}

		for(int i=arr.length-1; i>=0; i--){
			b[c[(arr[i]/place)%10]-1] = arr[i];
			c[(arr[i]/place)%10]--;
		}

		for(int i=0; i<arr.length; i++){
			arr[i] = b[i];			
		}
	}
}