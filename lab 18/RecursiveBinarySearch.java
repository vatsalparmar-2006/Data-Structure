// Write a program to implement a Binary Search using Recursion.

import java.util.*;

public class RecursiveBinarySearch {
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

		int result = RecursiveBinarySearch(arr,0,length-1,searchElement);

		System.out.println();
		if(result!=-1){
			System.out.println("Search element at " + result + " in array.");
		}
		else{
			System.out.println("Search element is not found in array.");
		}
	}

	public static int RecursiveBinarySearch(int[] arr,int low,int high,int searchElement){
		// Arrays.sort(arr);
		if(low<=high){
			int mid = (low+high)/2;
			if(arr[mid]==searchElement){
				return mid;   //If found then return it's index but here mid as index 
			}
			else if(arr[mid]>searchElement){
				return RecursiveBinarySearch(arr,low,mid-1,searchElement);
			}
			else{
				return RecursiveBinarySearch(arr,mid+1,high,searchElement);
			}
		}
		return -1;    //If searchElement is not found in array
	}
}