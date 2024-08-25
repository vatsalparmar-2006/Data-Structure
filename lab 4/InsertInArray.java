// 21. Write a program to insert a number at a given location in an array.

import java.util.*;

public class InsertInArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter length for array : ");
		int n = sc.nextInt();

		System.out.println();
		int[] a = new int[n];
		for(int i=0; i<a.length;i++){
			System.out.print("Enter element of array["+(i+1)+"] : ");
			a[i] = sc.nextInt();
		}

		System.out.println();
		System.out.print("Enter insert the element : ");
		int element = sc.nextInt();

		System.out.print("Enter index where you insert element : ");
		int index = sc.nextInt();

		int[] updateA = new int[n+1];

		int j=0;
		for(int i=0; i<=a.length; i++){
				if(i<index){
					updateA[j] = a[i];
				}
				else if(i==index){
					updateA[j] =  element;
				}
				else{
					updateA[j] = a[i-1];
				}
			j++;
			
		}

		System.out.println();
		System.out.print("After insert : ");
		for(int i=0; i<updateA.length; i++){
			System.out.print(updateA[i] + " ");
		}
	}
}