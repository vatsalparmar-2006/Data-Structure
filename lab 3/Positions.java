// 16. Write a program to find position of the smallest number & the largest number
// from given n numbers.

import java.util.*;

public class Positions {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of array : ");
		int l = sc.nextInt();
		int[] array = new int[l];

		for(int i=0 ; i<array.length; i++){
			System.out.print("Enter element of array["+(i+1)+"] : ");
			 array[i] =  sc.nextInt();
		}

		int min=array[0], max=array[0], smallIndex=0, largeIndex=0;

		for(int i=1; i<array.length; i++){
			if(array[i]<min){
				min=array[i];
				smallIndex=i;
			}
			if(array[i]>max){
				max=array[i];
				largeIndex=i;
			}
		}

		System.out.println("Small value element's index is "+smallIndex);
		System.out.println("Large value element's index is "+largeIndex);
	}
}