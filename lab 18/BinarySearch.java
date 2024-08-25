// 91. Write a program to implement a Binary Search using Array.

import java.util.*;

public class BinarySearch {
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

		//scan search Element from array
		System.out.println();
		System.out.print("Enter element to search from array : ");
		int searchElement = sc.nextInt();

		int result = binarySearch(arr,searchElement);

		System.out.println();
		if(result!=-1){
			System.out.println("Search element at " + result + " in array.");
		}
		else{
			System.out.println("Search element is not found in array.");
		}
	}

	public static int binarySearch(int[] arr,int searchElement){
		// Arrays.sort(arr);
		int low = 0;
		int high = arr.length-1;

		while(low<=high){
			int mid = (low+high)/2;
			if(arr[mid]==searchElement){
				return mid;   //If found then return it's index but here mid as index
			}
			if(arr[mid]>searchElement){
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}
		return -1;    //If searchElement is not found in array
	}
}