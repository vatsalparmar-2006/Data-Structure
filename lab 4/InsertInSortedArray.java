// 23. Write a program to insert a number in an array that is already sorted in an
// ascending order.

import java.util.Scanner;

public class InsertInSortedArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter length for array : ");
		int n = sc.nextInt();

		int[] a = new int[n];
		for(int i=0; i<a.length;i++){
			System.out.print("Enter element in assending order of array["+(i+1)+"] : ");
			a[i] = sc.nextInt();
		}

		System.out.print("Enter insert element : ");
		int element = sc.nextInt();


		int[] updateA = new int[n+1];

		int j=0;
		boolean flag = true;
		for(int i=0; i<a.length; i++){
			if(a[i]<element){
				updateA[j] = a[i];
			}
			else if(flag){
				updateA[j] = element;
				flag = false;
				i--;
			}
			else if(a[i]==element){
				updateA[j] = element;
			}
			else if(a[i]>element){
				updateA[j] = a[i];
			}
			j++;
		}

		if(flag){
			updateA[j] = element;
			flag = false;
		}

		System.out.print("After insert : ");
		for(int i=0; i<updateA.length; i++){
			System.out.print(updateA[i] +" ");
		}
	}
}