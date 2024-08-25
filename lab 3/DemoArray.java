// 13. Write a program to read and display n numbers using an array.

import java.util.*;

public class DemoArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of array : ");
		int l = sc.nextInt();
		int[] array = new int[l];

		for(int i=0 ; i<array.length; i++){
			System.out.print("Enter element of array["+(i+1)+"] : ");
			 array[i] =  sc.nextInt();
		}

		System.out.println("Array is : ");	
		for(int i=0 ; i<l ; i++){
			System.out.println(array[i]);
		}
	}
}