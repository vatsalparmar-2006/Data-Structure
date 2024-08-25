// 24. Write a program to delete a number from an array that is already sorted in an
// ascending order.

import java.util.*;

public class DeleteInSortedArray {
	public static void main(String[] args) {
		
		// delete from sorted array

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter length for array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<arr.length;i++){
			System.out.print("Enter element of array["+(i+1)+"] : ");
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.print("Enter element to delete : ");
		int element = sc.nextInt();

		int index = findIndex(arr,element);

		if(index!=-1){
			arr = deleteInSortedArray(arr,index);
			System.out.println("Array after deletion: " + Arrays.toString(arr));
		}
		else{
			 System.out.println("Element not found in Array.");
		}
	}

	public static int findIndex(int[] arr,int element){
		for(int i=0; i<arr.length; i++){
			if(arr[i]==element){
				return i; // if found
			}
		}
		return -1; // if not found
	}

	public static int[] deleteInSortedArray(int[] arr,int index){

		int[] newArray = new int[arr.length-1];

		for(int i=0, k=0; i<arr.length; i++){
			if(i==index){
				continue; //skip element to be deleted
			}
			newArray[k++] = arr[i];
		}
		return newArray;
	}
}