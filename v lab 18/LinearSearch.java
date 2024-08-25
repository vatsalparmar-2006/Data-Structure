// 90. Write a program to implement a Linear Search using Array.

import java.util.*;

public class LinearSearch {
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

		int result = linearSearch(arr,searchElement);

		System.out.println();
		if(result!=-1){
			System.out.println("Search element at " + result + " in array.");
		}
		else{
			System.out.println("Search element is not found in array.");
		}
	}

	public static int linearSearch(int[] arr,int searchElement){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==searchElement){
				return i; //If found then return it's index
			}
		}
		return -1; //If searchElement is not found in array
	}
}