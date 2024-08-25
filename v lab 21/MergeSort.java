// 96. Write a program to implement Merge Sort using Array

import java.util.*;

public class MergeSort {
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

		//print sorted array
		System.out.println();
		System.out.print("After Sorted by Merge Sort : ");
		mergeSort(arr,0,length-1);
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

	public static void mergeSort(int[] arr,int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}

	public static void merge(int[] arr,int low,int mid,int high){
		int h = low;
		int i = 0;
		int j = mid+1;
		int[] newarr = new int[high-low+1];

		while(h<=mid && j<=high){
			if(arr[h]<=arr[j]){
				newarr[i] = arr[h];
				h++;
			}
			else{
				newarr[i] = arr[j];
				j++;
			}
			i++;
		}

		while (h <= mid) {
            newarr[i] = arr[h];
            h++;
            i++;
        }

        while (j <= high) {
            newarr[i] = arr[j];
            j++;
            i++;
        }

        for (i = 0; i < newarr.length; i++) {
            arr[low + i] = newarr[i];
        }
	}
}